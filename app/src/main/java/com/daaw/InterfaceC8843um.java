package com.daaw;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.daaw.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8843um extends InterfaceC2675Wp, InterfaceC1120Hw {

    /* JADX INFO: renamed from: com.daaw.um$a */
    public static final class a implements InterfaceC8843um {
        @Override // com.daaw.InterfaceC2675Wp, com.daaw.InterfaceC1120Hw
        public String a() {
            return "gzip";
        }

        @Override // com.daaw.InterfaceC1120Hw
        public InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // com.daaw.InterfaceC2675Wp
        public OutputStream c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* JADX INFO: renamed from: com.daaw.um$b */
    public static final class b implements InterfaceC8843um {
        public static final InterfaceC8843um a = new b();

        @Override // com.daaw.InterfaceC2675Wp, com.daaw.InterfaceC1120Hw
        public String a() {
            return "identity";
        }

        @Override // com.daaw.InterfaceC1120Hw
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // com.daaw.InterfaceC2675Wp
        public OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
