package com.daaw;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.gA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4766gA1 {
    public ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
    public Base64OutputStream b = new Base64OutputStream(this.a, 10);

    public final String toString() {
        try {
            this.b.close();
        } catch (IOException e) {
            AbstractC4274eT1.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.a.close();
            return this.a.toString();
        } catch (IOException e2) {
            AbstractC4274eT1.zzh("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.a = null;
            this.b = null;
        }
    }
}
