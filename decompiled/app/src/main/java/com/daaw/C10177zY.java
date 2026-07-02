package com.daaw;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.zY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10177zY implements InterfaceC0657Dk0 {
    public final InterfaceC0657Dk0 a;
    public final InterfaceC0657Dk0 b;

    /* JADX INFO: renamed from: com.daaw.zY$a */
    public static class a implements InterfaceC2177Rv {
        public final InterfaceC2177Rv a;
        public final InterfaceC2177Rv b;

        public a(InterfaceC2177Rv interfaceC2177Rv, InterfaceC2177Rv interfaceC2177Rv2) {
            this.a = interfaceC2177Rv;
            this.b = interfaceC2177Rv2;
        }

        @Override // com.daaw.InterfaceC2177Rv
        public void b() {
            InterfaceC2177Rv interfaceC2177Rv = this.a;
            if (interfaceC2177Rv != null) {
                interfaceC2177Rv.b();
            }
            InterfaceC2177Rv interfaceC2177Rv2 = this.b;
            if (interfaceC2177Rv2 != null) {
                interfaceC2177Rv2.b();
            }
        }

        @Override // com.daaw.InterfaceC2177Rv
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AY a(EnumC9190vz0 enumC9190vz0) throws Exception {
            InputStream inputStream;
            InterfaceC2177Rv interfaceC2177Rv = this.a;
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (interfaceC2177Rv != null) {
                try {
                    inputStream = (InputStream) interfaceC2177Rv.a(enumC9190vz0);
                } catch (Exception e) {
                    if (this.b == null) {
                        throw e;
                    }
                    inputStream = null;
                }
            } else {
                inputStream = null;
            }
            InterfaceC2177Rv interfaceC2177Rv2 = this.b;
            if (interfaceC2177Rv2 != null) {
                try {
                    parcelFileDescriptor = (ParcelFileDescriptor) interfaceC2177Rv2.a(enumC9190vz0);
                } catch (Exception e2) {
                    if (inputStream == null) {
                        throw e2;
                    }
                }
            }
            return new AY(inputStream, parcelFileDescriptor);
        }

        @Override // com.daaw.InterfaceC2177Rv
        public void cancel() {
            InterfaceC2177Rv interfaceC2177Rv = this.a;
            if (interfaceC2177Rv != null) {
                interfaceC2177Rv.cancel();
            }
            InterfaceC2177Rv interfaceC2177Rv2 = this.b;
            if (interfaceC2177Rv2 != null) {
                interfaceC2177Rv2.cancel();
            }
        }

        @Override // com.daaw.InterfaceC2177Rv
        public String getId() {
            InterfaceC2177Rv interfaceC2177Rv = this.a;
            return interfaceC2177Rv != null ? interfaceC2177Rv.getId() : this.b.getId();
        }
    }

    public C10177zY(InterfaceC0657Dk0 interfaceC0657Dk0, InterfaceC0657Dk0 interfaceC0657Dk02) {
        if (interfaceC0657Dk0 == null && interfaceC0657Dk02 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.a = interfaceC0657Dk0;
        this.b = interfaceC0657Dk02;
    }

    @Override // com.daaw.InterfaceC0657Dk0
    public InterfaceC2177Rv a(Object obj, int i, int i2) {
        InterfaceC0657Dk0 interfaceC0657Dk0 = this.a;
        InterfaceC2177Rv interfaceC2177RvA = interfaceC0657Dk0 != null ? interfaceC0657Dk0.a(obj, i, i2) : null;
        InterfaceC0657Dk0 interfaceC0657Dk02 = this.b;
        InterfaceC2177Rv interfaceC2177RvA2 = interfaceC0657Dk02 != null ? interfaceC0657Dk02.a(obj, i, i2) : null;
        if (interfaceC2177RvA == null && interfaceC2177RvA2 == null) {
            return null;
        }
        return new a(interfaceC2177RvA, interfaceC2177RvA2);
    }
}
