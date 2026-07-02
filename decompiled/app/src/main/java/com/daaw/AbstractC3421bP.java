package com.daaw;

/* JADX INFO: renamed from: com.daaw.bP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3421bP {
    public static void a(F51 f51, EnumC8911uz0 enumC8911uz0) {
        if (!(f51 instanceof M51)) {
            AbstractC2732Xd0.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", f51);
        } else {
            P51.c().e().l(((M51) f51).d().f(enumC8911uz0), 1);
        }
    }
}
