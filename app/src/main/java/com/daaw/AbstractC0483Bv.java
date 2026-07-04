package com.daaw;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0483Bv {
    public static void a(JZ0 jz0) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorH0 = jz0.h0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorH0.moveToNext()) {
            try {
                arrayList.add(cursorH0.getString(0));
            } catch (Throwable th) {
                cursorH0.close();
                throw th;
            }
        }
        cursorH0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                jz0.v("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(QJ0 qj0, MZ0 mz0, boolean z, CancellationSignal cancellationSignal) {
        Cursor cursorQ = qj0.q(mz0, cancellationSignal);
        if (!z || !(cursorQ instanceof AbstractWindowedCursor)) {
            return cursorQ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQ;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? AbstractC2069Qu.a(abstractWindowedCursor) : cursorQ;
    }

    public static int c(File file) throws Throwable {
        Throwable th;
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                channel.tryLock(60L, 4L, true);
                channel.position(60L);
                if (channel.read(byteBufferAllocate) != 4) {
                    throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
                }
                byteBufferAllocate.rewind();
                int i = byteBufferAllocate.getInt();
                channel.close();
                return i;
            } catch (Throwable th2) {
                th = th2;
                fileChannel = channel;
                if (fileChannel == null) {
                    throw th;
                }
                fileChannel.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
