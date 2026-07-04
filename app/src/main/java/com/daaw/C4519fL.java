package com.daaw;

import android.net.Uri;
import com.daaw.C3561bt0;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4519fL implements C3561bt0.a {
    public final C3561bt0.a a;
    public final List b;

    public C4519fL(C3561bt0.a aVar, List list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // com.daaw.C3561bt0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3962dL a(Uri uri, InputStream inputStream) {
        InterfaceC3962dL interfaceC3962dL = (InterfaceC3962dL) this.a.a(uri, inputStream);
        List list = this.b;
        return (list == null || list.isEmpty()) ? interfaceC3962dL : (InterfaceC3962dL) interfaceC3962dL.a(this.b);
    }
}
