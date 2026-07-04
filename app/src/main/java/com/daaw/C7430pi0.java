package com.daaw;

import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.pi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7430pi0 implements InterfaceC7377pX {
    public final Uri a;
    public final int b;

    public C7430pi0(Uri uri) {
        this.a = uri;
        this.b = c(uri);
    }

    public static int c(Uri uri) {
        String strSubstring;
        String path = uri.getPath();
        if (path != null) {
            try {
                strSubstring = path.substring(path.lastIndexOf(".") + 1);
            } catch (Exception unused) {
                strSubstring = "";
            }
            String lowerCase = strSubstring.toLowerCase();
            if (lowerCase.startsWith("mpd")) {
                return 0;
            }
            if (lowerCase.startsWith("ism") || lowerCase.startsWith("isml")) {
                return 1;
            }
            if (!lowerCase.equals("flv") && lowerCase.equals("m3u8")) {
                return 2;
            }
        }
        return 3;
    }

    @Override // com.daaw.InterfaceC7377pX
    public Uri a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC7377pX
    public int b() {
        return this.b;
    }
}
