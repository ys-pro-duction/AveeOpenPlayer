import sys

def patch_file(filepath):
    with open(filepath, 'r') as f:
        content = f.read()

    # The R class might be com.example.colormixer.R depending on build system, or it.moondroid.colormixer.R
    content = content.replace("import com.example.colormixer.R;", "import it.moondroid.colormixer.R;")

    with open(filepath, 'w') as f:
        f.write(content)

patch_file('ColorMixer/src/main/java/it/moondroid/colormixer/ColorFragment.java')
patch_file('ColorMixer/src/main/java/it/moondroid/colormixer/HSLFragment.java')
