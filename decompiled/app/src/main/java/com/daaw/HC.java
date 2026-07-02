package com.daaw;

import com.daaw.AbstractC2560Vm0;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class HC extends AbstractC2872Ym0 {
    @Override // com.daaw.AbstractC2560Vm0.c
    public String a() {
        return "dns";
    }

    @Override // com.daaw.AbstractC2872Ym0
    public boolean d() {
        return true;
    }

    @Override // com.daaw.AbstractC2872Ym0
    public int e() {
        return 5;
    }

    @Override // com.daaw.AbstractC2560Vm0.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public GC b(URI uri, AbstractC2560Vm0.a aVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) AbstractC7785qy0.o(uri.getPath(), "targetPath");
        AbstractC7785qy0.k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new GC(uri.getAuthority(), str.substring(1), aVar, AbstractC7365pU.u, C8772uX0.c(), AbstractC7520q10.a(HC.class.getClassLoader()));
    }
}
