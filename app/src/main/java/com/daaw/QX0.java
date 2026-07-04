package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class QX0 implements CG {
    @Override // com.daaw.CG
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArrB = C3505bi.a().b();
        while (true) {
            try {
                int i = inputStream.read(bArrB);
                if (i == -1) {
                    C3505bi.a().c(bArrB);
                    return true;
                }
                outputStream.write(bArrB, 0, i);
            } catch (IOException unused) {
                C3505bi.a().c(bArrB);
                return false;
            } catch (Throwable th) {
                C3505bi.a().c(bArrB);
                throw th;
            }
        }
    }

    @Override // com.daaw.CG
    public String getId() {
        return "";
    }
}
