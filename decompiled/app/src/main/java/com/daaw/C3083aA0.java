package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.android.billingclient.api.f;
import com.daaw.GM;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.daaw.aA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/daaw/aA0;", "Lcom/daaw/NB;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "P1", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lcom/daaw/G91;", "Q0", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "scale", "d2", "(Landroid/view/View;F)V", "Landroid/animation/ObjectAnimator;", "", "delay", "duration", "l2", "(Landroid/animation/ObjectAnimator;JJ)Landroid/animation/ObjectAnimator;", "Landroid/animation/AnimatorSet;", "Landroid/animation/Animator$AnimatorListener;", "f2", "(Landroid/animation/AnimatorSet;)Landroid/animation/Animator$AnimatorListener;", "", "viewId", "", "visible", "k2", "(IZ)V", "Lcom/daaw/GM;", "W0", "Lcom/daaw/O90;", "e2", "()Lcom/daaw/GM;", "firestoreViewModel", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C3083aA0 extends NB {

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public final O90 firestoreViewModel = AbstractC3192ab0.a(new a());

    /* JADX INFO: renamed from: com.daaw.aA0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GM invoke() {
            MP mpR1 = C3083aA0.this.r1();
            G10.f(mpR1, "requireActivity(...)");
            return (GM) new androidx.lifecycle.y(mpR1).b(GM.class);
        }
    }

    /* JADX INFO: renamed from: com.daaw.aA0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ View B;
        public final /* synthetic */ C3083aA0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, C3083aA0 c3083aA0) {
            super(1);
            this.B = view;
            this.C = c3083aA0;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G91.a;
        }

        public final void invoke(String str) {
            ((TextView) this.B.findViewById(AbstractC5056hD0.x0)).setText(str);
            this.C.k2(AbstractC5056hD0.V0, false);
            this.C.k2(AbstractC5056hD0.f3, false);
            this.C.k2(AbstractC5056hD0.n0, false);
            this.C.k2(AbstractC5056hD0.w0, true);
            this.C.k2(AbstractC5056hD0.x0, true);
            this.C.k2(AbstractC5056hD0.v0, true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.aA0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public d() {
            super(1);
        }

        public final void a(GM.a aVar) {
            AbstractC0441Bk1.b(aVar.a(), aVar.b());
            new a.C0003a(C3083aA0.this.s1()).i("Fail").f(aVar.b()).a().show();
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GM.a) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aA0$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ View B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(1);
            this.B = view;
        }

        public final void a(Boolean bool) {
            ProgressBar progressBar = (ProgressBar) this.B.findViewById(AbstractC5056hD0.Y1);
            if (progressBar == null) {
                return;
            }
            G10.d(bool);
            progressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.aA0$f */
    public static final class f implements InterfaceC9145vp0, InterfaceC7074oR {
        public final /* synthetic */ NQ a;

        public f(NQ nq) {
            G10.g(nq, "function");
            this.a = nq;
        }

        @Override // com.daaw.InterfaceC7074oR
        public final InterfaceC5390iR a() {
            return this.a;
        }

        @Override // com.daaw.InterfaceC9145vp0
        public final /* synthetic */ void b(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC9145vp0) && (obj instanceof InterfaceC7074oR)) {
                return G10.c(a(), ((InterfaceC7074oR) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final void g2(C3083aA0 c3083aA0, View view) {
        G10.g(c3083aA0, "this$0");
        c3083aA0.L1();
    }

    public static final void h2(C3083aA0 c3083aA0, View view) {
        G10.g(c3083aA0, "this$0");
        c3083aA0.U1(false);
        c3083aA0.k2(AbstractC5056hD0.Y0, false);
        c3083aA0.k2(AbstractC5056hD0.V0, true);
        c3083aA0.k2(AbstractC5056hD0.f3, true);
        c3083aA0.k2(AbstractC5056hD0.n0, true);
        c3083aA0.k2(AbstractC5056hD0.v, true);
    }

    public static final void i2(View view, EditText editText, C3083aA0 c3083aA0, View view2) {
        G10.g(view, "$view");
        G10.g(c3083aA0, "this$0");
        CheckBox checkBox = (CheckBox) view.findViewById(AbstractC5056hD0.m0);
        View view3 = (TextView) view.findViewById(AbstractC5056hD0.o0);
        if (!checkBox.isChecked()) {
            G10.d(checkBox);
            c3083aA0.d2(checkBox, 1.05f);
            G10.d(view3);
            c3083aA0.d2(view3, 1.05f);
            return;
        }
        String string = editText.getText().toString();
        if (new C8146sG0("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$").b(string)) {
            c3083aA0.e2().h(string);
            return;
        }
        G10.d(editText);
        c3083aA0.d2(editText, 1.05f);
        G10.d(view3);
        c3083aA0.d2(view3, 1.05f);
    }

    public static final void j2(C3083aA0 c3083aA0, View view) {
        G10.g(c3083aA0, "this$0");
        c3083aA0.E1(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/redeem?code=" + c3083aA0.e2().n().e())));
    }

    @Override // com.daaw.NB
    public Dialog P1(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(s1(), RD0.l);
        dialog.setCancelable(false);
        return dialog;
    }

    @Override // androidx.fragment.app.c
    public void Q0(final View view, Bundle savedInstanceState) {
        f.c cVarA;
        G10.g(view, "view");
        super.Q0(view, savedInstanceState);
        ImageView imageView = (ImageView) view.findViewById(AbstractC5056hD0.v);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Wz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3083aA0.g2(this.B, view2);
                }
            });
        }
        view.findViewById(AbstractC5056hD0.Y0).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Xz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3083aA0.h2(this.B, view2);
            }
        });
        ((TextView) view.findViewById(AbstractC5056hD0.o0)).setMovementMethod(LinkMovementMethod.getInstance());
        Object obj = null;
        List list = (List) WB0.w.a(null);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (G10.c(((com.android.billingclient.api.f) next).c(), "premium_1month")) {
                    obj = next;
                    break;
                }
            }
            com.android.billingclient.api.f fVar = (com.android.billingclient.api.f) obj;
            if (fVar != null && (cVarA = C8808uf.i.a(fVar)) != null) {
                int i = JD0.D4;
                String strC = cVarA.c();
                G10.f(strC, "getFormattedPrice(...)");
                String strV = V(i, AY0.s(strC, " ", " ", false, 4, null));
                G10.f(strV, "getString(...)");
                ((TextView) view.findViewById(AbstractC5056hD0.t2)).setText(strV);
            }
        }
        final EditText editText = (EditText) view.findViewById(AbstractC5056hD0.V0);
        String strC2 = C4989gz0.a.c();
        if (strC2 != null) {
            G10.d(editText);
            editText.setText(strC2);
        }
        Button button = (Button) view.findViewById(AbstractC5056hD0.f3);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Yz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3083aA0.i2(view, editText, this, view2);
                }
            });
        }
        Button button2 = (Button) view.findViewById(AbstractC5056hD0.v0);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Zz0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3083aA0.j2(this.B, view2);
                }
            });
        }
        e2().n().f(Y(), new f(new c(view, this)));
        e2().l().f(Y(), new f(new d()));
        e2().m().f(Y(), new f(new e(view)));
        if (e2().n().e() != null) {
            k2(AbstractC5056hD0.Y0, false);
            return;
        }
        TextView textView = (TextView) view.findViewById(AbstractC5056hD0.g3);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        G10.f(objectAnimatorOfFloat, "ofFloat(...)");
        ObjectAnimator objectAnimatorL2 = l2(objectAnimatorOfFloat, 200L, 50L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat2, "ofFloat(...)");
        ObjectAnimator objectAnimatorL22 = l2(objectAnimatorOfFloat2, 20L, 50L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        G10.f(objectAnimatorOfFloat3, "ofFloat(...)");
        ObjectAnimator objectAnimatorL23 = l2(objectAnimatorOfFloat3, 100L, 30L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat4, "ofFloat(...)");
        ObjectAnimator objectAnimatorL24 = l2(objectAnimatorOfFloat4, 30L, 50L);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        G10.f(objectAnimatorOfFloat5, "ofFloat(...)");
        ObjectAnimator objectAnimatorL25 = l2(objectAnimatorOfFloat5, 200L, 60L);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat6, "ofFloat(...)");
        ObjectAnimator objectAnimatorL26 = l2(objectAnimatorOfFloat6, 100L, 50L);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat7, "ofFloat(...)");
        animatorSet.playSequentially(objectAnimatorL2, objectAnimatorL22, objectAnimatorL23, objectAnimatorL24, objectAnimatorL25, objectAnimatorL26, l2(objectAnimatorOfFloat7, 3000L, 130L));
        f2(animatorSet);
        animatorSet.start();
        TextView textView2 = (TextView) view.findViewById(AbstractC5056hD0.h3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f);
        G10.f(objectAnimatorOfFloat8, "ofFloat(...)");
        ObjectAnimator objectAnimatorL27 = l2(objectAnimatorOfFloat8, 0L, 0L);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat9, "ofFloat(...)");
        ObjectAnimator objectAnimatorL28 = l2(objectAnimatorOfFloat9, 400L, 50L);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f);
        G10.f(objectAnimatorOfFloat10, "ofFloat(...)");
        ObjectAnimator objectAnimatorL29 = l2(objectAnimatorOfFloat10, 100L, 30L);
        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat11, "ofFloat(...)");
        ObjectAnimator objectAnimatorL210 = l2(objectAnimatorOfFloat11, 30L, 50L);
        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f);
        G10.f(objectAnimatorOfFloat12, "ofFloat(...)");
        ObjectAnimator objectAnimatorL211 = l2(objectAnimatorOfFloat12, 200L, 60L);
        ObjectAnimator objectAnimatorOfFloat13 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat13, "ofFloat(...)");
        ObjectAnimator objectAnimatorL212 = l2(objectAnimatorOfFloat13, 100L, 50L);
        ObjectAnimator objectAnimatorOfFloat14 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 1.0f);
        G10.f(objectAnimatorOfFloat14, "ofFloat(...)");
        animatorSet2.playSequentially(objectAnimatorL27, objectAnimatorL28, objectAnimatorL29, objectAnimatorL210, objectAnimatorL211, objectAnimatorL212, l2(objectAnimatorOfFloat14, 3000L, 0L));
        f2(animatorSet2);
        animatorSet2.start();
    }

    public final void d2(View view, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f2);
        Property property2 = View.SCALE_Y;
        animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f2));
        G91 g91 = G91.a;
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f));
        animatorSet.playSequentially(animatorSet2, animatorSet3);
        animatorSet.start();
    }

    public final GM e2() {
        return (GM) this.firestoreViewModel.getValue();
    }

    public final Animator.AnimatorListener f2(AnimatorSet animatorSet) {
        b bVar = new b(animatorSet);
        animatorSet.addListener(bVar);
        return bVar;
    }

    public final void k2(int viewId, boolean visible) {
        View viewX = X();
        View viewFindViewById = viewX != null ? viewX.findViewById(viewId) : null;
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setVisibility(visible ? 0 : 8);
    }

    public final ObjectAnimator l2(ObjectAnimator objectAnimator, long j, long j2) {
        objectAnimator.setStartDelay(j);
        objectAnimator.setDuration(j2);
        return objectAnimator;
    }

    @Override // androidx.fragment.app.c
    public View v0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        G10.g(inflater, "inflater");
        View viewInflate = inflater.inflate(AbstractC9815yD0.R, container, false);
        G10.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: com.daaw.aA0$b */
    public static final class b implements Animator.AnimatorListener {
        public final /* synthetic */ AnimatorSet a;

        public b(AnimatorSet animatorSet) {
            this.a = animatorSet;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
