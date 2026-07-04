package com.daaw;

import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7673qb implements InterfaceC2177Rv {
    public final String a;
    public final AssetManager b;
    public Object c;

    public AbstractC7673qb(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // com.daaw.InterfaceC2177Rv
    public Object a(EnumC9190vz0 enumC9190vz0) {
        Object objD = d(this.b, this.a);
        this.c = objD;
        return objD;
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void b() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    public abstract void c(Object obj);

    public abstract Object d(AssetManager assetManager, String str);

    @Override // com.daaw.InterfaceC2177Rv
    public String getId() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void cancel() {
    }
}
