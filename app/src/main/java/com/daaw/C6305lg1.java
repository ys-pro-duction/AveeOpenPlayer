package com.daaw;

import com.daaw.C7400pc0;
import com.daaw.C9632xb;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.lg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6305lg1 extends AbstractC8915v0 {
    public static final AbstractC4340ei t = AbstractC4340ei.C;
    public final MG0 s;

    /* JADX INFO: renamed from: com.daaw.lg1$a */
    public interface a extends KX0 {
        void e(CU0 cu0, AbstractC5738jg1 abstractC5738jg1);
    }

    public C6305lg1(C7612qM c7612qM, C9632xb c9632xb, MG0 mg0, a aVar) {
        super(c7612qM, AM.a(), c9632xb, C9632xb.d.LISTEN_STREAM_CONNECTION_BACKOFF, C9632xb.d.LISTEN_STREAM_IDLE, C9632xb.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.s = mg0;
    }

    @Override // com.daaw.AbstractC8915v0
    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.daaw.AbstractC8915v0
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.daaw.AbstractC8915v0
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // com.daaw.AbstractC8915v0
    public /* bridge */ /* synthetic */ void s() {
        super.s();
    }

    @Override // com.daaw.AbstractC8915v0
    public /* bridge */ /* synthetic */ void t() {
        super.t();
    }

    @Override // com.daaw.AbstractC8915v0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void p(C7679qc0 c7679qc0) {
        this.l.e();
        AbstractC5738jg1 abstractC5738jg1X = this.s.x(c7679qc0);
        ((a) this.m).e(this.s.w(c7679qc0), abstractC5738jg1X);
    }

    public void x(int i) {
        AbstractC6557mb.d(m(), "Unwatching targets requires an open stream", new Object[0]);
        v((C7400pc0) C7400pc0.h0().z(this.s.a()).A(i).n());
    }

    public void y(C5000h11 c5000h11) {
        AbstractC6557mb.d(m(), "Watching queries requires an open stream", new Object[0]);
        C7400pc0.b bVarY = C7400pc0.h0().z(this.s.a()).y(this.s.R(c5000h11));
        Map mapK = this.s.K(c5000h11);
        if (mapK != null) {
            bVarY.x(mapK);
        }
        v((C7400pc0) bVarY.n());
    }
}
