package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC1300Jp;
import com.daaw.AbstractC1815Oo;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC4910gi1;
import com.daaw.AbstractC6599mj1;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC1196Ip;
import com.daaw.InterfaceC1413Kr0;
import com.daaw.InterfaceC2525Vd1;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC5781jp;
import com.daaw.LQ;
import com.daaw.WE0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public WeakReference B;
    public IBinder C;
    public InterfaceC1196Ip D;
    public AbstractC1300Jp E;
    public LQ F;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    public static final class C0006a extends AbstractC4192e90 implements InterfaceC3429bR {
        public C0006a() {
            super(2);
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                a.this.a(interfaceC5781jp, 8);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC1300Jp abstractC1300Jp) {
        if (this.E != abstractC1300Jp) {
            this.E = abstractC1300Jp;
            if (abstractC1300Jp != null) {
                this.B = null;
            }
            InterfaceC1196Ip interfaceC1196Ip = this.D;
            if (interfaceC1196Ip != null) {
                interfaceC1196Ip.a();
                this.D = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.C != iBinder) {
            this.C = iBinder;
            this.B = null;
        }
    }

    public abstract void a(InterfaceC5781jp interfaceC5781jp, int i);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final AbstractC1300Jp b(AbstractC1300Jp abstractC1300Jp) {
        AbstractC1300Jp abstractC1300Jp2 = i(abstractC1300Jp) ? abstractC1300Jp : null;
        if (abstractC1300Jp2 != null) {
            this.B = new WeakReference(abstractC1300Jp2);
        }
        return abstractC1300Jp;
    }

    public final void c() {
        if (this.H) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.E == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        InterfaceC1196Ip interfaceC1196Ip = this.D;
        if (interfaceC1196Ip != null) {
            interfaceC1196Ip.a();
        }
        this.D = null;
        requestLayout();
    }

    public final void f() {
        if (this.D == null) {
            try {
                this.H = true;
                this.D = AbstractC6599mj1.e(this, j(), AbstractC1815Oo.c(-656146368, true, new C0006a()));
            } finally {
                this.H = false;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.D != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.G;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public final boolean i(AbstractC1300Jp abstractC1300Jp) {
        return !(abstractC1300Jp instanceof WE0) || ((WE0.c) ((WE0) abstractC1300Jp).X().getValue()).compareTo(WE0.c.ShuttingDown) > 0;
    }

    public final AbstractC1300Jp j() {
        AbstractC1300Jp abstractC1300Jp;
        AbstractC1300Jp abstractC1300JpB = this.E;
        if (abstractC1300JpB == null) {
            AbstractC1300Jp abstractC1300JpD = AbstractC4910gi1.d(this);
            AbstractC1300Jp abstractC1300Jp2 = null;
            abstractC1300JpB = abstractC1300JpD != null ? b(abstractC1300JpD) : null;
            if (abstractC1300JpB == null) {
                WeakReference weakReference = this.B;
                if (weakReference != null && (abstractC1300Jp = (AbstractC1300Jp) weakReference.get()) != null && i(abstractC1300Jp)) {
                    abstractC1300Jp2 = abstractC1300Jp;
                }
                return abstractC1300Jp2 == null ? b(AbstractC4910gi1.h(this)) : abstractC1300Jp2;
            }
        }
        return abstractC1300JpB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(AbstractC1300Jp abstractC1300Jp) {
        setParentContext(abstractC1300Jp);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.G = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((InterfaceC1413Kr0) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(InterfaceC2525Vd1 interfaceC2525Vd1) {
        G10.g(interfaceC2525Vd1, "strategy");
        LQ lq = this.F;
        if (lq != null) {
            lq.invoke();
        }
        this.F = interfaceC2525Vd1.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        G10.g(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.F = InterfaceC2525Vd1.a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }
}
