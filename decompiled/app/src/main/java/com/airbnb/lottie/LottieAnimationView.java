package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.daaw.AbstractC0301Ab1;
import com.daaw.AbstractC1672Ne0;
import com.daaw.AbstractC1876Pd0;
import com.daaw.AbstractC4492fE0;
import com.daaw.AbstractC6314li0;
import com.daaw.AbstractC6783nO;
import com.daaw.C0737Ee0;
import com.daaw.C1317Jt0;
import com.daaw.C4615ff0;
import com.daaw.C7415pf0;
import com.daaw.C7972rf0;
import com.daaw.C8530tf0;
import com.daaw.C9797y9;
import com.daaw.DS0;
import com.daaw.G9;
import com.daaw.HC0;
import com.daaw.InterfaceC4581fY;
import com.daaw.InterfaceC6011kf0;
import com.daaw.InterfaceC7136of0;
import com.daaw.S11;
import com.daaw.S70;
import com.daaw.U80;
import com.daaw.WG0;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends C9797y9 {
    public static final InterfaceC6011kf0 S = new InterfaceC6011kf0() { // from class: com.daaw.ze0
        @Override // com.daaw.InterfaceC6011kf0
        public final void onResult(Object obj) {
            LottieAnimationView.d((Throwable) obj);
        }
    };
    public final InterfaceC6011kf0 E;
    public final InterfaceC6011kf0 F;
    public InterfaceC6011kf0 G;
    public int H;
    public final C4615ff0 I;
    public String J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final Set O;
    public final Set P;
    public C7972rf0 Q;
    public C0737Ee0 R;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String B;
        public int C;
        public float D;
        public boolean E;
        public String F;
        public int G;
        public int H;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.B);
            parcel.writeFloat(this.D);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeString(this.F);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.B = parcel.readString();
            this.D = parcel.readFloat();
            this.E = parcel.readInt() == 1;
            this.F = parcel.readString();
            this.G = parcel.readInt();
            this.H = parcel.readInt();
        }
    }

    public class a implements InterfaceC6011kf0 {
        public a() {
        }

        @Override // com.daaw.InterfaceC6011kf0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.H != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.H);
            }
            (LottieAnimationView.this.G == null ? LottieAnimationView.S : LottieAnimationView.this.G).onResult(th);
        }
    }

    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = new InterfaceC6011kf0() { // from class: com.daaw.Be0
            @Override // com.daaw.InterfaceC6011kf0
            public final void onResult(Object obj) {
                this.a.setComposition((C0737Ee0) obj);
            }
        };
        this.F = new a();
        this.H = 0;
        this.I = new C4615ff0();
        this.L = false;
        this.M = false;
        this.N = true;
        this.O = new HashSet();
        this.P = new HashSet();
        o(attributeSet, HC0.a);
    }

    public static /* synthetic */ C7415pf0 c(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.N ? AbstractC1672Ne0.l(lottieAnimationView.getContext(), str) : AbstractC1672Ne0.m(lottieAnimationView.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th) {
        if (!AbstractC0301Ab1.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        AbstractC1876Pd0.d("Unable to load composition.", th);
    }

    public static /* synthetic */ C7415pf0 e(LottieAnimationView lottieAnimationView, int i) {
        return lottieAnimationView.N ? AbstractC1672Ne0.u(lottieAnimationView.getContext(), i) : AbstractC1672Ne0.v(lottieAnimationView.getContext(), i, null);
    }

    private void setCompositionTask(C7972rf0 c7972rf0) {
        this.O.add(b.SET_ANIMATION);
        k();
        j();
        this.Q = c7972rf0.d(this.E).c(this.F);
    }

    public boolean getClipToCompositionBounds() {
        return this.I.E();
    }

    public C0737Ee0 getComposition() {
        return this.R;
    }

    public long getDuration() {
        C0737Ee0 c0737Ee0 = this.R;
        if (c0737Ee0 != null) {
            return (long) c0737Ee0.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.I.I();
    }

    public String getImageAssetsFolder() {
        return this.I.K();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.I.M();
    }

    public float getMaxFrame() {
        return this.I.N();
    }

    public float getMinFrame() {
        return this.I.O();
    }

    public C1317Jt0 getPerformanceTracker() {
        return this.I.P();
    }

    public float getProgress() {
        return this.I.Q();
    }

    public WG0 getRenderMode() {
        return this.I.R();
    }

    public int getRepeatCount() {
        return this.I.S();
    }

    public int getRepeatMode() {
        return this.I.T();
    }

    public float getSpeed() {
        return this.I.U();
    }

    public void i(S70 s70, Object obj, C8530tf0 c8530tf0) {
        this.I.p(s70, obj, c8530tf0);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C4615ff0) && ((C4615ff0) drawable).R() == WG0.SOFTWARE) {
            this.I.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C4615ff0 c4615ff0 = this.I;
        if (drawable2 == c4615ff0) {
            super.invalidateDrawable(c4615ff0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j() {
        C7972rf0 c7972rf0 = this.Q;
        if (c7972rf0 != null) {
            c7972rf0.i(this.E);
            this.Q.h(this.F);
        }
    }

    public final void k() {
        this.R = null;
        this.I.s();
    }

    public void l(boolean z) {
        this.I.y(z);
    }

    public final C7972rf0 m(final String str) {
        return isInEditMode() ? new C7972rf0(new Callable() { // from class: com.daaw.ye0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.c(this.a, str);
            }
        }, true) : this.N ? AbstractC1672Ne0.j(getContext(), str) : AbstractC1672Ne0.k(getContext(), str, null);
    }

    public final C7972rf0 n(final int i) {
        return isInEditMode() ? new C7972rf0(new Callable() { // from class: com.daaw.Ae0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.e(this.a, i);
            }
        }, true) : this.N ? AbstractC1672Ne0.s(getContext(), i) : AbstractC1672Ne0.t(getContext(), i, null);
    }

    public final void o(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC4492fE0.C, i, 0);
        this.N = typedArrayObtainStyledAttributes.getBoolean(AbstractC4492fE0.E, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.O);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.J);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.T);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC4492fE0.O, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(AbstractC4492fE0.J);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(AbstractC4492fE0.T)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(AbstractC4492fE0.I, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC4492fE0.D, false)) {
            this.M = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC4492fE0.M, false)) {
            this.I.C0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.R)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(AbstractC4492fE0.R, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.Q)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(AbstractC4492fE0.Q, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.S)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(AbstractC4492fE0.S, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.F)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(AbstractC4492fE0.F, true));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(AbstractC4492fE0.L));
        setProgress(typedArrayObtainStyledAttributes.getFloat(AbstractC4492fE0.N, 0.0f));
        l(typedArrayObtainStyledAttributes.getBoolean(AbstractC4492fE0.H, false));
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.G)) {
            i(new S70("**"), InterfaceC7136of0.K, new C8530tf0(new DS0(G9.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(AbstractC4492fE0.G, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC4492fE0.P)) {
            int i2 = AbstractC4492fE0.P;
            WG0 wg0 = WG0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i2, wg0.ordinal());
            if (iOrdinal >= WG0.values().length) {
                iOrdinal = wg0.ordinal();
            }
            setRenderMode(WG0.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(AbstractC4492fE0.K, false));
        typedArrayObtainStyledAttributes.recycle();
        this.I.G0(Boolean.valueOf(AbstractC0301Ab1.f(getContext()) != 0.0f));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.M) {
            return;
        }
        this.I.c0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.J = savedState.B;
        Set set = this.O;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.J)) {
            setAnimation(this.J);
        }
        this.K = savedState.C;
        if (!this.O.contains(bVar) && (i = this.K) != 0) {
            setAnimation(i);
        }
        if (!this.O.contains(b.SET_PROGRESS)) {
            setProgress(savedState.D);
        }
        if (!this.O.contains(b.PLAY_OPTION) && savedState.E) {
            r();
        }
        if (!this.O.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.F);
        }
        if (!this.O.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.G);
        }
        if (this.O.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.H);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.B = this.J;
        savedState.C = this.K;
        savedState.D = this.I.Q();
        savedState.E = this.I.Z();
        savedState.F = this.I.K();
        savedState.G = this.I.T();
        savedState.H = this.I.S();
        return savedState;
    }

    public boolean p() {
        return this.I.Y();
    }

    public void q() {
        this.M = false;
        this.I.b0();
    }

    public void r() {
        this.O.add(b.PLAY_OPTION);
        this.I.c0();
    }

    public void s(InputStream inputStream, String str) {
        setCompositionTask(AbstractC1672Ne0.n(inputStream, str));
    }

    public void setAnimation(int i) {
        this.K = i;
        this.J = null;
        setCompositionTask(n(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        t(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.N ? AbstractC1672Ne0.w(getContext(), str) : AbstractC1672Ne0.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.I.h0(z);
    }

    public void setCacheComposition(boolean z) {
        this.N = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.I.i0(z);
    }

    public void setComposition(C0737Ee0 c0737Ee0) {
        if (U80.a) {
            Objects.toString(c0737Ee0);
        }
        this.I.setCallback(this);
        this.R = c0737Ee0;
        this.L = true;
        boolean zJ0 = this.I.j0(c0737Ee0);
        this.L = false;
        if (getDrawable() != this.I || zJ0) {
            if (!zJ0) {
                u();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.P.iterator();
            if (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                throw null;
            }
        }
    }

    public void setFailureListener(InterfaceC6011kf0 interfaceC6011kf0) {
        this.G = interfaceC6011kf0;
    }

    public void setFallbackResource(int i) {
        this.H = i;
    }

    public void setFontAssetDelegate(AbstractC6783nO abstractC6783nO) {
        this.I.k0(abstractC6783nO);
    }

    public void setFrame(int i) {
        this.I.l0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.I.m0(z);
    }

    public void setImageAssetDelegate(InterfaceC4581fY interfaceC4581fY) {
        this.I.n0(interfaceC4581fY);
    }

    public void setImageAssetsFolder(String str) {
        this.I.o0(str);
    }

    @Override // com.daaw.C9797y9, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        j();
        super.setImageBitmap(bitmap);
    }

    @Override // com.daaw.C9797y9, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        j();
        super.setImageDrawable(drawable);
    }

    @Override // com.daaw.C9797y9, android.widget.ImageView
    public void setImageResource(int i) {
        j();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.I.p0(z);
    }

    public void setMaxFrame(int i) {
        this.I.q0(i);
    }

    public void setMaxProgress(float f) {
        this.I.s0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.I.u0(str);
    }

    public void setMinFrame(int i) {
        this.I.v0(i);
    }

    public void setMinProgress(float f) {
        this.I.x0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.I.y0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.I.z0(z);
    }

    public void setProgress(float f) {
        this.O.add(b.SET_PROGRESS);
        this.I.A0(f);
    }

    public void setRenderMode(WG0 wg0) {
        this.I.B0(wg0);
    }

    public void setRepeatCount(int i) {
        this.O.add(b.SET_REPEAT_COUNT);
        this.I.C0(i);
    }

    public void setRepeatMode(int i) {
        this.O.add(b.SET_REPEAT_MODE);
        this.I.D0(i);
    }

    public void setSafeMode(boolean z) {
        this.I.E0(z);
    }

    public void setSpeed(float f) {
        this.I.F0(f);
    }

    public void setTextDelegate(S11 s11) {
        this.I.H0(s11);
    }

    public void t(String str, String str2) {
        s(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public final void u() {
        boolean zP = p();
        setImageDrawable(null);
        setImageDrawable(this.I);
        if (zP) {
            this.I.f0();
        }
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C4615ff0 c4615ff0;
        if (!this.L && drawable == (c4615ff0 = this.I) && c4615ff0.Y()) {
            q();
        } else if (!this.L && (drawable instanceof C4615ff0)) {
            C4615ff0 c4615ff02 = (C4615ff0) drawable;
            if (c4615ff02.Y()) {
                c4615ff02.b0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.I.r0(str);
    }

    public void setMinFrame(String str) {
        this.I.w0(str);
    }

    public void setAnimation(String str) {
        this.J = str;
        this.K = 0;
        setCompositionTask(m(str));
    }
}
