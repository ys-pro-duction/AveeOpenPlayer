package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1121Hw0 {
    public static C1121Hw0[] d = {new C1121Hw0("PLA Playlist", 1, "pla", true), new C1121Hw0("PLS Playlist", 3, "pls", true), new C1121Hw0("MPCPL Playlist", 4, "mpcpl", true), new C1121Hw0("PLP Playlist", 5, "plp", true), new C1121Hw0("M3U Playlist", 6, "m3u", true), new C1121Hw0("M3U8 Playlist", 7, "m3u8", true)};
    public final String a;
    public final String b;
    public final boolean c;

    public C1121Hw0(String str, int i, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static boolean a(String str) {
        return str.equals("pla") || str.equals("pls") || str.equals("mpcpl") || str.equals("plp") || str.equals("m3u") || str.equals("m3u8") || str.equals("m4u") || str.equals("ram");
    }
}
