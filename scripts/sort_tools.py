import json

from hex_to_hsl import hex_to_hsl


def sort_tools_by_hsl(tools):
    for tool in tools:
        h, s, l = hex_to_hsl(tool['badge_color'])
        tool['hsl'] = (h, s, l)

    tools_sorted = sorted(tools, key=lambda x: (x['hsl'][0], x['hsl'][1], x['hsl'][2]))
    return tools_sorted

if __name__ == "__main__":
    with open('./data/tools.json', 'r') as file:
        tools = json.load(file)

    sorted_tools = sort_tools_by_hsl(tools)
    
    with open('./data/sorted_tools.json', 'w') as file:
        json.dump(sorted_tools, file, indent=2)
