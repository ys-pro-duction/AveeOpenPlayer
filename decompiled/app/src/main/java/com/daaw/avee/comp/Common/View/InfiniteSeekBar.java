package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC9438ws;
import com.daaw.G10;
import com.daaw.PC0;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001RB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010?\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00109R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00106R\u0014\u0010L\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00106R\u0018\u0010O\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u00109¨\u0006S"}, d2 = {"Lcom/daaw/avee/comp/Common/View/InfiniteSeekBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "invertedProgress", "Lcom/daaw/G91;", "setInvertedProgress", "(I)V", "getInvertedProgress", "()I", "", "getProgress", "()F", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "progress", "setProgress", "(F)V", "stepVal", "setStep", "Lcom/daaw/avee/comp/Common/View/InfiniteSeekBar$a;", "listener", "setOnProgressChangeListener", "(Lcom/daaw/avee/comp/Common/View/InfiniteSeekBar$a;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "performClick", "()Z", "computeScroll", "()V", "Landroid/graphics/Paint;", "B", "Landroid/graphics/Paint;", "paint", "C", "paintTransparent", "D", "I", "rawProgress", "E", "F", "step", "fixedStepWidth", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "trackLength", "H", "initialTouchX", "initialProgress", "Landroid/view/VelocityTracker;", "J", "Landroid/view/VelocityTracker;", "velocityTracker", "Landroid/widget/Scroller;", "K", "Landroid/widget/Scroller;", "scroller", "L", "minFlingVelocity", "M", "maxFlingVelocity", "N", "Lcom/daaw/avee/comp/Common/View/InfiniteSeekBar$a;", "onProgressChangeListener", "O", "lineHeightRatio", "a", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InfiniteSeekBar extends View {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final Paint paint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final Paint paintTransparent;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int rawProgress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public float step;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final int fixedStepWidth;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int trackLength;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public float initialTouchX;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int initialProgress;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final Scroller scroller;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final int minFlingVelocity;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final int maxFlingVelocity;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public a onProgressChangeListener;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final float lineHeightRatio;

    public interface a {
        void a(InfiniteSeekBar infiniteSeekBar, float f, boolean z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfiniteSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        G10.g(context, "context");
    }

    private final int getInvertedProgress() {
        return this.trackLength - this.rawProgress;
    }

    private final float getProgress() {
        return (this.rawProgress / this.fixedStepWidth) * this.step;
    }

    private final void setInvertedProgress(int invertedProgress) {
        this.rawProgress = this.trackLength - invertedProgress;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.scroller.computeScrollOffset()) {
            setInvertedProgress(this.scroller.getCurrX());
            a aVar = this.onProgressChangeListener;
            if (aVar != null) {
                aVar.a(this, getProgress(), false);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        G10.g(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        float height2 = (getHeight() * this.lineHeightRatio) / 2;
        int i = this.rawProgress;
        int i2 = this.fixedStepWidth;
        int i3 = ((i - width) + 100) / i2;
        int i4 = ((i + width) - 100) / i2;
        if (i3 <= i4) {
            int i5 = i3;
            while (true) {
                float f = ((this.fixedStepWidth * i5) + width) - i;
                float f2 = height;
                canvas.drawLine(f, f2 - height2, f, f2 + height2, i5 % 5 == 0 ? this.paint : this.paintTransparent);
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        float f3 = width;
        float f4 = height;
        canvas.drawLine(f3, (f4 - height2) - 40.0f, f3, f4 + height2 + 40.0f, this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.trackLength = this.fixedStepWidth;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.initialTouchX = event.getX();
            this.initialProgress = getInvertedProgress();
            getParent().requestDisallowInterceptTouchEvent(true);
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            } else if (velocityTracker != null) {
                velocityTracker.clear();
            }
            VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(event);
            }
            if (!this.scroller.isFinished()) {
                this.scroller.abortAnimation();
            }
            requestFocus();
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            VelocityTracker velocityTracker3 = this.velocityTracker;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(event);
            }
            float x = (event.getX() - this.initialTouchX) / 2;
            getParent().requestDisallowInterceptTouchEvent(true);
            setInvertedProgress(this.initialProgress + ((int) x));
            a aVar = this.onProgressChangeListener;
            if (aVar != null) {
                aVar.a(this, getProgress(), true);
            }
            invalidate();
            return true;
        }
        if ((numValueOf == null || numValueOf.intValue() != 1) && (numValueOf == null || numValueOf.intValue() != 3)) {
            return super.onTouchEvent(event);
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        VelocityTracker velocityTracker4 = this.velocityTracker;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(event);
        }
        VelocityTracker velocityTracker5 = this.velocityTracker;
        if (velocityTracker5 != null) {
            velocityTracker5.computeCurrentVelocity(1000, this.maxFlingVelocity);
        }
        VelocityTracker velocityTracker6 = this.velocityTracker;
        int xVelocity = velocityTracker6 != null ? (int) velocityTracker6.getXVelocity() : 0;
        if (Math.abs(xVelocity) > this.minFlingVelocity) {
            this.scroller.fling(getInvertedProgress(), 0, xVelocity, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            AbstractC2317Td1.g0(this);
        }
        VelocityTracker velocityTracker7 = this.velocityTracker;
        if (velocityTracker7 != null) {
            velocityTracker7.recycle();
        }
        this.velocityTracker = null;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setOnProgressChangeListener(a listener) {
        G10.g(listener, "listener");
        this.onProgressChangeListener = listener;
    }

    public final void setProgress(float progress) {
        this.rawProgress = (int) ((progress / this.step) * this.fixedStepWidth);
        invalidate();
    }

    public final void setStep(float stepVal) {
        this.step = stepVal;
    }

    public /* synthetic */ InfiniteSeekBar(Context context, AttributeSet attributeSet, int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        G10.g(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(AbstractC9438ws.c(context, PC0.g));
        paint.setStrokeWidth(5.0f);
        this.paint = paint;
        Paint paint2 = new Paint(paint);
        paint2.setAlpha(30);
        this.paintTransparent = paint2;
        this.step = (float) Math.pow(10.0f, -3);
        this.fixedStepWidth = 50;
        this.scroller = new Scroller(context);
        this.minFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.maxFlingVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        setPadding(0, 0, 0, 0);
        this.lineHeightRatio = 0.85f;
    }
}
