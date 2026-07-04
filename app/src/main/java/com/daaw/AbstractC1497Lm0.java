package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1497Lm0 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(java.lang.String r4, int r5) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            r0.setDataSource(r4)     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L25
            r4 = 17
            java.lang.String r4 = r0.extractMetadata(r4)     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L25
            if (r4 == 0) goto L1a
            r2 = -1
            android.graphics.Bitmap r4 = r0.getFrameAtTime(r2)     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L25
            goto L1b
        L18:
            r4 = move-exception
            goto L21
        L1a:
            r4 = r1
        L1b:
            r0.release()     // Catch: java.lang.Exception -> L1f
            goto L2b
        L1f:
            goto L2b
        L21:
            r0.release()     // Catch: java.lang.Exception -> L24
        L24:
            throw r4
        L25:
            r0.release()     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
        L2a:
            r4 = r1
        L2b:
            if (r4 != 0) goto L2e
            return r1
        L2e:
            r0 = 1
            if (r5 != r0) goto L58
            int r5 = r4.getWidth()
            int r1 = r4.getHeight()
            int r2 = java.lang.Math.max(r5, r1)
            r3 = 512(0x200, float:7.17E-43)
            if (r2 <= r3) goto L62
            r3 = 1140850688(0x44000000, float:512.0)
            float r2 = (float) r2
            float r3 = r3 / r2
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = java.lang.Math.round(r3)
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r5, r1, r0)
            goto L62
        L58:
            r0 = 3
            if (r5 != r0) goto L62
            r5 = 2
            r0 = 96
            android.graphics.Bitmap r4 = android.media.ThumbnailUtils.extractThumbnail(r4, r0, r0, r5)
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC1497Lm0.a(java.lang.String, int):android.graphics.Bitmap");
    }
}
