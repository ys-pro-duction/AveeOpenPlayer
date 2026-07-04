package com.daaw;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class RX0 implements InterfaceC2283Sv {
    public static final b D = new b();
    public final NI0 B = new CK();
    public final CG C = new QX0();

    public static class b implements NI0 {
        public b() {
        }

        @Override // com.daaw.NI0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KI0 c(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        @Override // com.daaw.NI0
        public String getId() {
            return "";
        }
    }

    @Override // com.daaw.InterfaceC2283Sv
    public CG b() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public OI0 d() {
        return C2256So0.c();
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 e() {
        return D;
    }

    @Override // com.daaw.InterfaceC2283Sv
    public NI0 f() {
        return this.B;
    }
}
