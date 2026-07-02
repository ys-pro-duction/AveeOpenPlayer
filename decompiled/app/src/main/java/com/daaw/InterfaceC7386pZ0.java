package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.pZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7386pZ0 {
    public static final InterfaceC7386pZ0 a = new a();

    /* JADX INFO: renamed from: com.daaw.pZ0$a */
    public static class a implements InterfaceC7386pZ0 {
        @Override // com.daaw.InterfaceC7386pZ0
        public boolean b(Format format) {
            String str = format.G;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // com.daaw.InterfaceC7386pZ0
        public InterfaceC6828nZ0 c(Format format) {
            String str = format.G;
            str.getClass();
            switch (str) {
                case "application/dvbsubs":
                    return new RE(format.I);
                case "application/pgs":
                    return new C8047ru0();
                case "application/x-mp4-vtt":
                    return new C1077Hl0();
                case "text/vtt":
                    return new C1785Og1();
                case "application/x-quicktime-tx3g":
                    return new C4183e71(format.I);
                case "text/x-ssa":
                    return new MV0(format.I);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new C1795Oj(format.G, format.a0);
                case "application/cea-708":
                    return new C2025Qj(format.a0);
                case "application/x-subrip":
                    return new C3183aZ0();
                case "application/ttml+xml":
                    return new C8382t61();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    boolean b(Format format);

    InterfaceC6828nZ0 c(Format format);
}
