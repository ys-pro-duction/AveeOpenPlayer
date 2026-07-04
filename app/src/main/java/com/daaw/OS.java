package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class OS implements InterfaceC0657Dk0 {
    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2177Rv a(HS hs, int i, int i2) {
        return new a(hs);
    }

    public static class a implements InterfaceC2177Rv {
        public final HS a;

        public a(HS hs) {
            this.a = hs;
        }

        @Override // com.daaw.InterfaceC2177Rv
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HS a(EnumC9190vz0 enumC9190vz0) {
            return this.a;
        }

        @Override // com.daaw.InterfaceC2177Rv
        public String getId() {
            return String.valueOf(this.a.d());
        }

        @Override // com.daaw.InterfaceC2177Rv
        public void b() {
        }

        @Override // com.daaw.InterfaceC2177Rv
        public void cancel() {
        }
    }
}
