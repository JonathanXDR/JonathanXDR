import json
import urllib.parse


def generate_badge_urls(tools):
    badges = []
    for tool in tools:
        tool["badge_color"] = tool["badge_color"].replace("#", "")
        encoded_badge_name = urllib.parse.quote(tool['badge_name'])
        encoded_logo_name = urllib.parse.quote(tool['logo_name'])
        badge_url = f"https://img.shields.io/badge/-{encoded_badge_name}-{tool['badge_color']}?style=flat-square&logo={encoded_logo_name}&logoColor={tool['logo_color']}"
        badges.append(f'<img alt="{tool["badge_name"]}" src="{badge_url}" />')
    return badges

if __name__ == "__main__":
    with open('./data/sorted_tools.json', 'r') as file:
        sorted_tools = json.load(file)

    badges = generate_badge_urls(sorted_tools)
    badges_str = '\n'.join(badges)

    with open('./data/badges.html', 'w') as file:
        file.write(badges_str)
