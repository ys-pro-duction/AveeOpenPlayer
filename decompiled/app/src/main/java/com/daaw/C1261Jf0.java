package com.daaw;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1261Jf0 implements InterfaceC7649qV0 {
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
        bufferedWriter.write("MPCPLAYLIST");
        bufferedWriter.newLine();
        int i = 1;
        for (JI0 ji0 : this.b) {
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",type,");
            bufferedWriter.write(ji0.c());
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",filename,");
            bufferedWriter.write(ji0.a());
            bufferedWriter.newLine();
            if (ji0.b() != null) {
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write(",subtitle,");
                bufferedWriter.write(ji0.b());
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.flush();
    }

    public List c() {
        return this.b;
    }

    public void d(InterfaceC7927rV0 interfaceC7927rV0) {
        this.a = interfaceC7927rV0;
    }
}
