import re
import sys

def extract_methods(filepath):
    with open(filepath, 'r') as f:
        content = f.read()

    # Simple regex to find method signatures
    # Might be fragile, but good enough for a quick scan
    pattern = re.compile(r'(?:public|private|protected|static|\s) +[\w\<\>\[\]]+\s+(\w+) *\([^\)]*\) *(?:throws [a-zA-Z0-9_,\s]+)?\s*\{')
    methods = pattern.findall(content)
    return set(methods)

if __name__ == '__main__':
    base_file = sys.argv[1]
    decomp_file = sys.argv[2]

    base_methods = extract_methods(base_file)
    decomp_methods = extract_methods(decomp_file)

    print("Methods in Decompiled but not in Base:")
    for m in decomp_methods - base_methods:
        # Ignore common obfuscated methods
        if len(m) > 2 and m not in ['onCreate', 'onDestroy', 'onStart', 'onStop', 'onResume', 'onPause']:
            print(m)
