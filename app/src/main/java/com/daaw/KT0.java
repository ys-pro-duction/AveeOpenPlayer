package com.daaw;

import com.daaw.C0425Bg1;
import com.daaw.C0529Cg1;
import com.daaw.C0746Eg1;
import com.daaw.C10217zg1;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class KT0 {
    public List a = new LinkedList();

    public class a implements C10217zg1.a {
        public a() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            HT0 ht0C;
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 == null || mainActivityE1.getFragmentManager() == null) {
                return;
            }
            if (num.intValue() == 1) {
                LT0.g();
            } else {
                if (num.intValue() != 10 || (ht0C = HT0.c()) == null) {
                    return;
                }
                IT0 it0E = ht0C.e();
                ht0C.b(false, it0E.b, ht0C.g(), it0E.c);
            }
        }
    }

    public class b implements C0746Eg1.a {
        public b() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IT0 invoke() {
            HT0 ht0C = HT0.c();
            return ht0C == null ? new IT0() : ht0C.e();
        }
    }

    public class c implements C0425Bg1.a {
        public c() {
        }

        @Override // com.daaw.C0425Bg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool, Integer num, Boolean bool2) {
            IT0 it0 = new IT0();
            it0.a = bool.booleanValue();
            it0.b = num.intValue();
            it0.c = bool2.booleanValue();
            MainActivity mainActivityE1 = MainActivity.e1();
            if (mainActivityE1 != null) {
                mainActivityE1.N1(it0.a, false);
            }
        }
    }

    public class d implements C9938yg1.a {
        public d() {
        }

        @Override // com.daaw.C9938yg1.a
        public void invoke() {
            com.daaw.avee.comp.playback.c.f.a(3);
        }
    }

    public class e implements C0529Cg1.a {
        public e() {
        }

        @Override // com.daaw.C0529Cg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Boolean bool, Integer num, Date date, Boolean bool2) {
            HT0 ht0C = HT0.c();
            if (ht0C == null) {
                return;
            }
            ht0C.b(bool.booleanValue(), num.intValue(), date, bool2.booleanValue());
        }
    }

    public class f implements C0746Eg1.a {
        public f() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IT0 invoke() {
            HT0 ht0C = HT0.c();
            return ht0C == null ? new IT0() : ht0C.e();
        }
    }

    public class g implements C0746Eg1.a {
        public g() {
        }

        @Override // com.daaw.C0746Eg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            HT0 ht0C = HT0.c();
            if (ht0C == null) {
                return 0;
            }
            return Integer.valueOf(ht0C.f());
        }
    }

    public KT0() {
        MainActivity.T0.b(new a(), this.a);
        MainActivity.V0.b(new b(), this.a);
        HT0.f.b(new c(), this.a);
        HT0.g.b(new d(), this.a);
        LT0.J.b(new e(), this.a);
        LT0.K.b(new f(), this.a);
        LT0.L.b(new g(), this.a);
        LT0.M.b(new C0746Eg1.a() { // from class: com.daaw.JT0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return KT0.a();
            }
        }, this.a);
    }

    public static /* synthetic */ B61 a() {
        HT0 ht0C = HT0.c();
        return ht0C == null ? new B61(new Date(), Boolean.FALSE) : new B61(ht0C.g(), Boolean.valueOf(ht0C.e().a));
    }
}
