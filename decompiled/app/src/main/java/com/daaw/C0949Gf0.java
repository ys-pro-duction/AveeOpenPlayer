package com.daaw;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0949Gf0 implements InterfaceC7649qV0 {
    public transient InterfaceC7927rV0 a = null;
    public final List b = new ArrayList();
    public boolean c = false;

    @Override // com.daaw.InterfaceC7649qV0
    public InterfaceC7927rV0 a() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC7649qV0
    public void b(OutputStream outputStream, String str) throws IOException {
        if (str == null) {
            str = "UTF-8";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        if (this.c) {
            bufferedWriter.write("#EXTM3U");
            bufferedWriter.newLine();
        }
        for (LI0 li0 : this.b) {
            if (this.c) {
                bufferedWriter.write("#EXTINF:");
                bufferedWriter.write(Long.toString(li0.a()));
                bufferedWriter.write(",");
                if (li0.c() == null) {
                    bufferedWriter.write(li0.b());
                } else {
                    bufferedWriter.write(li0.c());
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.write(li0.b());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }

    public List c() {
        return this.b;
    }

    public void d(boolean z) {
        this.c = z;
    }

    public void e(InterfaceC7927rV0 interfaceC7927rV0) {
        this.a = interfaceC7927rV0;
    }
}
