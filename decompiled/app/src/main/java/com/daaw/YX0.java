package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class YX0 {
    public File a;
    public OutputStream b;

    public YX0(File file, OutputStream outputStream) {
        this.a = file;
        this.b = outputStream;
    }

    public boolean a(C7378pX0 c7378pX0) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    return true;
                }
                this.b.write(bArr, 0, i);
            }
        } catch (FileNotFoundException e) {
            AbstractC0441Bk1.c("Error finishing StreamToFileBridge");
            if (c7378pX0 != null) {
                c7378pX0.b("Failed creating output file", e);
            }
            return false;
        } catch (IOException e2) {
            AbstractC0441Bk1.c("Error finishing StreamToFileBridge");
            if (c7378pX0 != null) {
                c7378pX0.b("Failed creating output file", e2);
            }
            return false;
        }
    }
}
