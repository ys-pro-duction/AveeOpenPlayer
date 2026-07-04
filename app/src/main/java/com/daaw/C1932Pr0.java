package com.daaw;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1932Pr0 implements InterfaceC7649qV0 {
    public transient InterfaceC7927rV0 a = null;
    public final List b = new ArrayList();
    public String c = "HARP";

    @Override // com.daaw.InterfaceC7649qV0
    public InterfaceC7927rV0 a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC7649qV0
    public void b(OutputStream outputStream, String str) throws IOException {
        if (str == null) {
            str = "UTF-16LE";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        bufferedWriter.write("PLP PLAYLIST");
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        bufferedWriter.write("VERSION 1.20");
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        for (String str2 : this.b) {
            bufferedWriter.write(this.c);
            bufferedWriter.write(", ");
            bufferedWriter.write(str2);
            bufferedWriter.write(13);
            bufferedWriter.write(10);
        }
        bufferedWriter.flush();
    }

    public List c() {
        return this.b;
    }

    public void d(String str) {
        this.c = str.trim();
    }

    public void e(InterfaceC7927rV0 interfaceC7927rV0) {
        this.a = interfaceC7927rV0;
    }
}
