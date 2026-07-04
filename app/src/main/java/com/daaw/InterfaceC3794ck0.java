package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: renamed from: com.daaw.ck0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3794ck0 {
    public static final InterfaceC3794ck0 a = new a();

    /* JADX INFO: renamed from: com.daaw.ck0$a */
    public static class a implements InterfaceC3794ck0 {
        @Override // com.daaw.InterfaceC3794ck0
        public boolean b(Format format) {
            String str = format.G;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
        }

        @Override // com.daaw.InterfaceC3794ck0
        public InterfaceC3516bk0 c(Format format) {
            String str = format.G;
            str.getClass();
            switch (str) {
                case "application/id3":
                    return new OX();
                case "application/x-emsg":
                    return new TH();
                case "application/x-scte35":
                    return new C8485tV0();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    boolean b(Format format);

    InterfaceC3516bk0 c(Format format);
}
