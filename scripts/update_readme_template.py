import json
from datetime import datetime


def calculate_age(birthday):
    birth_date = datetime.strptime(birthday, '%Y-%m-%d')
    today = datetime.today()
    age = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
    return age

def calculate_apprenticeship_year(start_date):
    start_date = datetime.strptime(start_date, '%Y-%m-%d')
    today = datetime.today()
    apprenticeship_year = today.year - start_date.year - ((today.month, today.day) < (start_date.month, start_date.day)) + 1
    return apprenticeship_year

def update_readme_template(badges_str, profile, general_info, social_links, stats_info):
    with open('./templates/readme_template.gtpl', 'r') as file:
        template = file.read()

    age = calculate_age(profile['birthday'])
    apprenticeship_year = calculate_apprenticeship_year(profile['apprenticeship_start_date'])

    template = template.replace('<!-- WORKFLOW: BADGES -->', badges_str)
    template = template.replace('{{ .title }}', profile['title'])
    template = template.replace('{{ .description }}', profile['description'].replace('{{ age }}', str(age)).replace('{{ apprenticeship_year }}', str(apprenticeship_year)))

    social_links_str = '\n'.join([f'<a href="{link["url"]}">{link["name"]}</a> •' for link in social_links])
    template = template.replace('{{ range .social_links }}', social_links_str)

    general_info_str = '\n'.join([f'<li>{info}</li>' for info in general_info])
    template = template.replace('{{ range .general_info }}', general_info_str)

    for i, info in enumerate(stats_info):
        template = template.replace(f'{{ index .stats_info {i} }}', info)

    with open('./templates/readme_template.gtpl', 'w') as file:
        file.write(template)

if __name__ == "__main__":
    with open('./data/badges.html', 'r') as file:
        badges_str = file.read()

    with open('./data/profile.json', 'r') as file:
        profile = json.load(file)

    with open('./data/general_info.json', 'r') as file:
        general_info = json.load(file)

    with open('./data/social_links.json', 'r') as file:
        social_links = json.load(file)

    with open('./data/stats_info.json', 'r') as file:
        stats_info = json.load(file)

    update_readme_template(badges_str, profile, general_info, social_links, stats_info)
