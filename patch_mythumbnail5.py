import sys

filepath = 'app/src/main/java/com/AOSP/MyThumbnailUtils.java'
with open(filepath, 'r') as f:
    content = f.read()

target = """            try {
                retriever.release();
            } catch (RuntimeException ex) {
                // Ignore failures while cleaning up.
            }"""

replacement = """            try {
                retriever.release();
            } catch (java.io.IOException ex) {
            } catch (RuntimeException ex) {
                // Ignore failures while cleaning up.
            } catch (Exception ex) {
                // Ignore failures while cleaning up.
            }"""

content = content.replace(target, replacement)

with open(filepath, 'w') as f:
    f.write(content)
