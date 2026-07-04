package com.daaw;

import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.xZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9624xZ0 {

    /* JADX INFO: renamed from: com.daaw.xZ0$a */
    public static final class a implements InterfaceC9624xZ0 {
        public static final a a = new a();

        @Override // com.daaw.InterfaceC9624xZ0
        public Collection a(C71 c71, Collection collection, NQ nq, NQ nq2) {
            G10.g(c71, "currentTypeConstructor");
            G10.g(collection, "superTypes");
            G10.g(nq, "neighbors");
            G10.g(nq2, "reportLoop");
            return collection;
        }
    }

    Collection a(C71 c71, Collection collection, NQ nq, NQ nq2);
}
