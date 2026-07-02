package com.daaw;

/* JADX INFO: renamed from: com.daaw.nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6931nu {

    /* JADX INFO: renamed from: com.daaw.nu$a */
    public static class a extends AbstractC6652mu {
        public a(String str) {
            super(str);
        }

        @Override // com.daaw.AbstractC6652mu
        public boolean b(InterfaceC6094ku interfaceC6094ku) {
            C8046ru c8046ruP = interfaceC6094ku.p(EnumC8325su.DAY_OF_YEAR);
            C8046ru c8046ruP2 = interfaceC6094ku.p(EnumC8325su.DAY_OF_MONTH);
            C8046ru c8046ruP3 = interfaceC6094ku.p(EnumC8325su.DAY_OF_WEEK);
            if (c8046ruP == null || (c8046ruP.d() instanceof C8688uC0)) {
                return (c8046ruP2 == null || (c8046ruP2.d() instanceof C8688uC0)) ? (c8046ruP3 == null || (c8046ruP3.d() instanceof C8688uC0)) ? false : true : c8046ruP3 != null && (c8046ruP3.d() instanceof C8688uC0);
            }
            return true;
        }
    }

    public static AbstractC6652mu a() {
        return new a("Both, a day-of-week AND a day-of-month parameter, are not supported.");
    }
}
