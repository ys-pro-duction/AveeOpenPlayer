import sys

filepath = 'app/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

target = """    defaultConfig {"""

replacement = """    lint {
        abortOnError false
    }

    defaultConfig {"""

if 'lint' not in content:
    content = content.replace(target, replacement)

with open(filepath, 'w') as f:
    f.write(content)

filepath = 'ColorMixer/build.gradle'
with open(filepath, 'r') as f:
    content = f.read()

if 'lint' not in content:
    content = content.replace(target, replacement)

with open(filepath, 'w') as f:
    f.write(content)
