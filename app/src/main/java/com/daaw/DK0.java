package com.daaw;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public class DK0 implements KZ0, AutoCloseable {
    public final Context B;
    public final String C;
    public final File D;
    public final int E;
    public final KZ0 F;
    public C3573bw G;
    public boolean H;

    public DK0(Context context, String str, File file, int i, KZ0 kz0) {
        this.B = context;
        this.C = str;
        this.D = file;
        this.E = i;
        this.F = kz0;
    }

    public final void a(File file) throws Throwable {
        ReadableByteChannel channel;
        if (this.C != null) {
            channel = Channels.newChannel(this.B.getAssets().open(this.C));
        } else {
            if (this.D == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.D).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.B.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        TK.a(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public void c(C3573bw c3573bw) {
        this.G = c3573bw;
    }

    @Override // com.daaw.KZ0, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.F.close();
        this.H = false;
    }

    public final void d() {
        String databaseName = getDatabaseName();
        File databasePath = this.B.getDatabasePath(databaseName);
        C3573bw c3573bw = this.G;
        C2375Ts c2375Ts = new C2375Ts(databaseName, this.B.getFilesDir(), c3573bw == null || c3573bw.j);
        try {
            c2375Ts.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else {
                if (this.G == null) {
                    return;
                }
                try {
                    int iC = AbstractC0483Bv.c(databasePath);
                    int i = this.E;
                    if (iC == i) {
                        return;
                    }
                    if (this.G.a(iC, i)) {
                        return;
                    }
                    if (this.B.deleteDatabase(databaseName)) {
                        try {
                            a(databasePath);
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                }
            }
        } finally {
            c2375Ts.c();
        }
    }

    @Override // com.daaw.KZ0
    public synchronized JZ0 e0() {
        try {
            if (!this.H) {
                d();
                this.H = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.F.e0();
    }

    @Override // com.daaw.KZ0
    public String getDatabaseName() {
        return this.F.getDatabaseName();
    }

    @Override // com.daaw.KZ0
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.F.setWriteAheadLoggingEnabled(z);
    }
}
