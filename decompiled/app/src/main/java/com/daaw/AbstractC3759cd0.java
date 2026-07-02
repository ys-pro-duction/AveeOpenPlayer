package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.cd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3759cd0 implements InterfaceC2177Rv {
    public final Uri a;
    public final Context b;
    public Object c;

    public AbstractC3759cd0(Context context, Uri uri) {
        this.b = context.getApplicationContext();
        this.a = uri;
    }

    @Override // com.daaw.InterfaceC2177Rv
    public final Object a(EnumC9190vz0 enumC9190vz0) {
        Object objD = d(this.a, this.b.getContentResolver());
        this.c = objD;
        return objD;
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void b() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(Object obj);

    public abstract Object d(Uri uri, ContentResolver contentResolver);

    @Override // com.daaw.InterfaceC2177Rv
    public String getId() {
        return this.a.toString();
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void cancel() {
    }
}
