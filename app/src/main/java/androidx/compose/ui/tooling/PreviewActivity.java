package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import com.daaw.AbstractActivityC5776jo;
import com.daaw.AbstractC1815Oo;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC5096hN0;
import com.daaw.AbstractC6500mN;
import com.daaw.AbstractC6952nz0;
import com.daaw.AbstractC7738qo;
import com.daaw.AbstractC9046vU0;
import com.daaw.BY0;
import com.daaw.C10250zn;
import com.daaw.C2567Vo;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC3986dR;
import com.daaw.InterfaceC5781jp;
import com.daaw.InterfaceC6643ms0;
import com.daaw.InterfaceC8007rm0;
import com.daaw.LQ;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lcom/daaw/jo;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/daaw/G91;", "onCreate", "(Landroid/os/Bundle;)V", "", "composableFqn", "a0", "(Ljava/lang/String;)V", "className", "methodName", "parameterProvider", "b0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "X", "Ljava/lang/String;", "TAG", "ui-tooling_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PreviewActivity extends AbstractActivityC5776jo {

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final String TAG = "PreviewActivity";

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(2);
            this.B = str;
            this.C = str2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) throws ClassNotFoundException {
            if (((i & 11) ^ 2) == 0 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                C10250zn.a.h(this.B, this.C, interfaceC5781jp, new Object[0]);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws ClassNotFoundException {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ Object[] B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;

        public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ InterfaceC8007rm0 B;
            public final /* synthetic */ Object[] C;

            /* JADX INFO: renamed from: androidx.compose.ui.tooling.PreviewActivity$b$a$a, reason: collision with other inner class name */
            public static final class C0007a extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ InterfaceC8007rm0 B;
                public final /* synthetic */ Object[] C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0007a(InterfaceC8007rm0 interfaceC8007rm0, Object[] objArr) {
                    super(0);
                    this.B = interfaceC8007rm0;
                    this.C = objArr;
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m0invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m0invoke() {
                    InterfaceC8007rm0 interfaceC8007rm0 = this.B;
                    interfaceC8007rm0.setValue(Integer.valueOf((((Number) interfaceC8007rm0.getValue()).intValue() + 1) % this.C.length));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC8007rm0 interfaceC8007rm0, Object[] objArr) {
                super(2);
                this.B = interfaceC8007rm0;
                this.C = objArr;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                } else {
                    AbstractC6500mN.a(C2567Vo.a.a(), new C0007a(this.B, this.C), null, null, null, null, 0L, 0L, null, interfaceC5781jp, 6, 508);
                }
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b, reason: collision with other inner class name */
        public static final class C0008b extends AbstractC4192e90 implements InterfaceC3986dR {
            public final /* synthetic */ String B;
            public final /* synthetic */ String C;
            public final /* synthetic */ Object[] D;
            public final /* synthetic */ InterfaceC8007rm0 E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0008b(String str, String str2, Object[] objArr, InterfaceC8007rm0 interfaceC8007rm0) {
                super(3);
                this.B = str;
                this.C = str2;
                this.D = objArr;
                this.E = interfaceC8007rm0;
            }

            public final void a(InterfaceC6643ms0 interfaceC6643ms0, InterfaceC5781jp interfaceC5781jp, int i) throws ClassNotFoundException {
                G10.g(interfaceC6643ms0, "it");
                if (((i & 81) ^ 16) == 0 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                } else {
                    C10250zn.a.h(this.B, this.C, interfaceC5781jp, this.D[((Number) this.E.getValue()).intValue()]);
                }
            }

            @Override // com.daaw.InterfaceC3986dR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws ClassNotFoundException {
                a((InterfaceC6643ms0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object[] objArr, String str, String str2) {
            super(2);
            this.B = objArr;
            this.C = str;
            this.D = str2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            interfaceC5781jp.e(-3687241);
            Object objF = interfaceC5781jp.f();
            if (objF == InterfaceC5781jp.a.a()) {
                objF = AbstractC9046vU0.d(0, null, 2, null);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
            AbstractC5096hN0.a(null, null, null, null, null, AbstractC1815Oo.b(interfaceC5781jp, -819891175, true, new a(interfaceC8007rm0, this.B)), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, AbstractC1815Oo.b(interfaceC5781jp, -819890235, true, new C0008b(this.C, this.D, this.B, interfaceC8007rm0)), interfaceC5781jp, 196608, 12582912, 131039);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ Object[] D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Object[] objArr) {
            super(2);
            this.B = str;
            this.C = str2;
            this.D = objArr;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) throws ClassNotFoundException {
            if (((i & 11) ^ 2) == 0 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            C10250zn c10250zn = C10250zn.a;
            String str = this.B;
            String str2 = this.C;
            Object[] objArr = this.D;
            c10250zn.h(str, str2, interfaceC5781jp, Arrays.copyOf(objArr, objArr.length));
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws ClassNotFoundException {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public final void a0(String composableFqn) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        G10.n("PreviewActivity has composable ", composableFqn);
        String strC0 = BY0.C0(composableFqn, '.', null, 2, null);
        String strU0 = BY0.u0(composableFqn, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra == null) {
            AbstractC7738qo.b(this, null, AbstractC1815Oo.c(-985531688, true, new a(strC0, strU0)), 1, null);
        } else {
            b0(strC0, strU0, stringExtra);
        }
    }

    public final void b0(String className, String methodName, String parameterProvider) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object[] objArrB = AbstractC6952nz0.b(AbstractC6952nz0.a(parameterProvider), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrB.length > 1) {
            AbstractC7738qo.b(this, null, AbstractC1815Oo.c(-985538154, true, new b(objArrB, className, methodName)), 1, null);
        } else {
            AbstractC7738qo.b(this, null, AbstractC1815Oo.c(-985537892, true, new c(className, methodName, objArrB)), 1, null);
        }
    }

    @Override // com.daaw.AbstractActivityC5776jo, com.daaw.AbstractActivityC7459po, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        a0(stringExtra);
    }
}
