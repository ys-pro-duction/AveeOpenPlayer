package com.daaw;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: com.daaw.nE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6744nE0 {
    public RandomAccessFile a;
    public MappedByteBuffer b;
    public boolean c;

    public C6744nE0(File file, int i) {
        this.c = false;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.a = randomAccessFile;
        try {
            this.b = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, i);
            this.c = true;
        } catch (IOException unused) {
            a();
        }
    }

    public static C6744nE0 b(String str, int i) {
        AbstractC0441Bk1.a("createTempFile");
        try {
            Context contextI = com.daaw.avee.a.i();
            if (contextI != null) {
                C6744nE0 c6744nE0 = new C6744nE0(new File(contextI.getCacheDir(), str), i);
                if (c6744nE0.c) {
                    return c6744nE0;
                }
                return null;
            }
        } catch (IOException unused) {
        }
        try {
            C6744nE0 c6744nE02 = new C6744nE0(File.createTempFile(str, null), i);
            if (c6744nE02.c) {
                return c6744nE02;
            }
            return null;
        } catch (IOException unused2) {
            return null;
        }
    }

    public void a() {
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    public ByteBuffer c(int i) {
        this.b.position(Math.min(this.b.limit(), Math.max(0, i)));
        return this.b;
    }

    public void d(int i, ByteBuffer byteBuffer) {
        this.b.position(i);
        this.b.put(byteBuffer);
    }
}
