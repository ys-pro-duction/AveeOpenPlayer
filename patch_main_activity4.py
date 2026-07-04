import sys
import re

filepath = 'app/src/main/java/com/aveeopen/MainActivity.java'
with open(filepath, 'r') as f:
    lines = f.readlines()

new_lines = []
in_switch = False
for i, line in enumerate(lines):
    if i == 492: # switch (id) {
        new_lines.append(line)
        in_switch = True
        continue

    if in_switch:
        if 'case R.id.home:' in line:
            new_lines.append('            default:\n                if (id == android.R.id.home) {\n')
            continue
        elif 'case R.id.menu_close:' in line:
            new_lines.append('                } else if (id == R.id.menu_close) {\n')
            continue
        elif 'case R.id.menu_settings:' in line:
            new_lines.append('                } else if (id == R.id.menu_settings) {\n')
            continue
        elif 'case R.id.menu_sleep_timer:' in line:
            new_lines.append('                } else if (id == R.id.menu_sleep_timer) {\n')
            continue
        elif 'case R.id.menu_equalizer:' in line:
            new_lines.append('                } else if (id == R.id.menu_equalizer) {\n')
            continue
        elif 'case R.id.action_bar_sleep_timer_indicator:' in line:
            new_lines.append('                } else if (id == R.id.action_bar_sleep_timer_indicator) {\n')
            continue
        elif 'case R.id.menu_lock_orient:' in line:
            new_lines.append('                } else if (id == R.id.menu_lock_orient) {\n')
            continue
        elif 'case R.id.action_bar_lock_orient_indicator:' in line:
            new_lines.append('                } else if (id == R.id.action_bar_lock_orient_indicator) {\n')
            continue
        elif 'case R.id.menu_lib:' in line:
            new_lines.append('                } else if (id == R.id.menu_lib) {\n')
            continue
        elif 'case R.id.menu_queue:' in line:
            new_lines.append('                } else if (id == R.id.menu_queue) {\n')
            continue
        elif 'case R.id.menu_visual:' in line:
            new_lines.append('                } else if (id == R.id.menu_visual) {\n')
            continue
        elif 'return super.onOptionsItemSelected(item);' in line and '}' not in line:
            new_lines.append('                }\n')
            new_lines.append(line)
            in_switch = False
            continue

    new_lines.append(line)

with open(filepath, 'w') as f:
    f.writelines(new_lines)
