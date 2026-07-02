package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class SI0 implements InterfaceC0657Dk0 {
    public final InterfaceC0657Dk0 a;
    public final Resources b;

    public SI0(Context context, InterfaceC0657Dk0 interfaceC0657Dk0) {
        this(context.getResources(), interfaceC0657Dk0);
    }

    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2177Rv a(Integer num, int i, int i2) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            uri = null;
        }
        if (uri != null) {
            return this.a.a(uri, i, i2);
        }
        return null;
    }

    public SI0(Resources resources, InterfaceC0657Dk0 interfaceC0657Dk0) {
        this.b = resources;
        this.a = interfaceC0657Dk0;
    }
}
