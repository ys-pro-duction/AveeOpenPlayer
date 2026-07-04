import sys

filepath = 'app/src/main/java/com/aveeopen/comp/playback/Song/PlaylistSongMetadataRetriever.java'
with open(filepath, 'r') as f:
    content = f.read()

target = """        metadataRetriever.release();"""

replacement = """        try { metadataRetriever.release(); } catch (java.io.IOException e) {} catch (Exception e) {}"""

content = content.replace(target, replacement)

with open(filepath, 'w') as f:
    f.write(content)
