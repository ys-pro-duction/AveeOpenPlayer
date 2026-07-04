package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue B;
    public TypedValue C;
    public TypedValue D;
    public TypedValue E;
    public TypedValue F;
    public TypedValue G;
    public final Rect H;
    public a I;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.H.set(i, i2, i3, i4);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.F == null) {
            this.F = new TypedValue();
        }
        return this.F;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.G == null) {
            this.G = new TypedValue();
        }
        return this.G;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.D == null) {
            this.D = new TypedValue();
        }
        return this.D;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.E == null) {
            this.E = new TypedValue();
        }
        return this.E;
    }

    public TypedValue getMinWidthMajor() {
        if (this.B == null) {
            this.B = new TypedValue();
        }
        return this.B;
    }

    public TypedValue getMinWidthMinor() {
        if (this.C == null) {
            this.C = new TypedValue();
        }
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.I;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.I;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.I = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = new Rect();
    }
}
