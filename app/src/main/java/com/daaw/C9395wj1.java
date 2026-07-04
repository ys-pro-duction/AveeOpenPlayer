package com.daaw;

import com.daaw.C8551tj1;
import com.daaw.C9632xb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9395wj1 extends AbstractC8915v0 {
    public static final AbstractC4340ei v = AbstractC4340ei.C;
    public final MG0 s;
    public boolean t;
    public AbstractC4340ei u;

    /* JADX INFO: renamed from: com.daaw.wj1$a */
    public interface a extends KX0 {
        void c(CU0 cu0, List list);

        void d();
    }

    public C9395wj1(C7612qM c7612qM, C9632xb c9632xb, MG0 mg0, a aVar) {
        super(c7612qM, AM.b(), c9632xb, C9632xb.d.WRITE_STREAM_CONNECTION_BACKOFF, C9632xb.d.WRITE_STREAM_IDLE, C9632xb.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.t = false;
        this.u = v;
        this.s = mg0;
    }

    public void A() {
        AbstractC6557mb.d(m(), "Writing handshake requires an opened stream", new Object[0]);
        AbstractC6557mb.d(!this.t, "Handshake already completed", new Object[0]);
        v((C8551tj1) C8551tj1.g0().y(this.s.a()).n());
    }

    public void B(List list) {
        AbstractC6557mb.d(m(), "Writing mutations requires an opened stream", new Object[0]);
        AbstractC6557mb.d(this.t, "Handshake must be complete before writing mutations", new Object[0]);
        C8551tj1.b bVarG0 = C8551tj1.g0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bVarG0.x(this.s.L((AbstractC9688xm0) it.next()));
        }
        bVarG0.z(this.u);
        v((C8551tj1) bVarG0.n());
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
    public void s() {
        this.t = false;
        super.s();
    }

    @Override // com.daaw.AbstractC8915v0
    public /* bridge */ /* synthetic */ void t() {
        super.t();
    }

    @Override // com.daaw.AbstractC8915v0
    public void u() {
        if (this.t) {
            B(Collections.EMPTY_LIST);
        }
    }

    public AbstractC4340ei w() {
        return this.u;
    }

    public boolean x() {
        return this.t;
    }

    @Override // com.daaw.AbstractC8915v0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void p(C8830uj1 c8830uj1) {
        this.u = c8830uj1.c0();
        if (!this.t) {
            this.t = true;
            ((a) this.m).d();
            return;
        }
        this.l.e();
        CU0 cu0V = this.s.v(c8830uj1.a0());
        int iE0 = c8830uj1.e0();
        ArrayList arrayList = new ArrayList(iE0);
        for (int i = 0; i < iE0; i++) {
            arrayList.add(this.s.m(c8830uj1.d0(i), cu0V));
        }
        ((a) this.m).c(cu0V, arrayList);
    }

    public void z(AbstractC4340ei abstractC4340ei) {
        this.u = (AbstractC4340ei) AbstractC8342sy0.b(abstractC4340ei);
    }
}
