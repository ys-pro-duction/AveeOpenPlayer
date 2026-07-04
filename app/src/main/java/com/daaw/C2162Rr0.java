package com.daaw;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Rr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2162Rr0 implements InterfaceC7649qV0 {
    public transient InterfaceC7927rV0 a = null;
    public final List b = new ArrayList();

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
        bufferedWriter.write("[Playlist]");
        bufferedWriter.newLine();
        bufferedWriter.write("NumberOfEntries=");
        bufferedWriter.write(Integer.toString(this.b.size()));
        bufferedWriter.newLine();
        int i = 1;
        for (LI0 li0 : this.b) {
            bufferedWriter.write("File");
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write("=");
            bufferedWriter.write(li0.b());
            bufferedWriter.newLine();
            if (li0.c() != null) {
                bufferedWriter.write("Title");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(li0.c());
                bufferedWriter.newLine();
            }
            if (li0.a() >= 0) {
                bufferedWriter.write("Length");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(Long.toString(li0.a()));
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.write("Version=2");
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }

    public List c() {
        return this.b;
    }

    public void d(InterfaceC7927rV0 interfaceC7927rV0) {
        this.a = interfaceC7927rV0;
    }
}
