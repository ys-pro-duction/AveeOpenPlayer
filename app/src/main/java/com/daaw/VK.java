package com.daaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VK {
    public File a;
    public long b;
    public long c;

    public VK(String str) throws IOException {
        this.a = new File(str);
        b();
    }

    public long a() {
        return this.b;
    }

    public final void b() throws IOException {
        if (!this.a.exists()) {
            throw new FileNotFoundException("File not found " + this.a.getPath());
        }
        if (this.a.canRead()) {
            this.b = this.a.length();
            this.c = this.a.lastModified();
        } else {
            throw new IOException("File not readable " + this.a.getPath());
        }
    }
}
