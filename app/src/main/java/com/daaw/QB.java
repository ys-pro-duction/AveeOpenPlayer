package com.daaw;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class QB extends Dialog {
    public LQ B;
    public PB C;
    public final View D;
    public final OB E;
    public final float F;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            G10.g(view, "view");
            G10.g(outline, "result");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC7560q90.values().length];
            iArr[EnumC7560q90.Ltr.ordinal()] = 1;
            iArr[EnumC7560q90.Rtl.ordinal()] = 2;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QB(LQ lq, PB pb, View view, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), PD0.a));
        G10.g(lq, "onDismissRequest");
        G10.g(pb, DiagnosticsEntry.Event.PROPERTIES_KEY);
        G10.g(view, "composeView");
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(interfaceC4988gz, "density");
        G10.g(uuid, "dialogId");
        this.B = lq;
        this.C = pb;
        this.D = view;
        float fL = C6460mD.l(30);
        this.F = fL;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        Context context = getContext();
        G10.f(context, "context");
        OB ob = new OB(context, window);
        ob.setTag(AbstractC6740nD0.H, "Dialog:" + uuid);
        ob.setClipChildren(false);
        ob.setElevation(interfaceC4988gz.O(fL));
        ob.setOutlineProvider(new a());
        this.E = ob;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            a(viewGroup);
        }
        setContentView(ob);
        AbstractC2217Se1.b(ob, AbstractC2217Se1.a(view));
        AbstractC2529Ve1.b(ob, AbstractC2529Ve1.a(view));
        AbstractC2425Ue1.b(ob, AbstractC2425Ue1.a(view));
        f(this.B, this.C, enumC7560q90);
    }

    public static final void a(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof OB) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                a(viewGroup2);
            }
        }
    }

    public final void b() {
        this.E.e();
    }

    public final void c(AbstractC1300Jp abstractC1300Jp, InterfaceC3429bR interfaceC3429bR) {
        G10.g(abstractC1300Jp, "parentComposition");
        G10.g(interfaceC3429bR, "children");
        this.E.o(abstractC1300Jp, interfaceC3429bR);
    }

    public final void d(EnumC7560q90 enumC7560q90) {
        OB ob = this.E;
        int i = b.a[enumC7560q90.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new C6902no0();
        }
        ob.setLayoutDirection(i2);
    }

    public final void e(EnumC9580xO0 enumC9580xO0) {
        boolean zA = AbstractC9859yO0.a(enumC9580xO0, AbstractC7265p6.a(this.D));
        Window window = getWindow();
        G10.d(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    public final void f(LQ lq, PB pb, EnumC7560q90 enumC7560q90) {
        G10.g(lq, "onDismissRequest");
        G10.g(pb, DiagnosticsEntry.Event.PROPERTIES_KEY);
        G10.g(enumC7560q90, "layoutDirection");
        this.B = lq;
        this.C = pb;
        e(pb.c());
        d(enumC7560q90);
        this.E.p(pb.d());
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.C.a()) {
            this.B.invoke();
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        G10.g(motionEvent, "event");
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.C.b()) {
            this.B.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
