package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.daaw.AD0;
import com.daaw.AbstractC7115ob;
import com.daaw.AbstractDialogInterfaceOnClickListenerC3616c51;
import com.daaw.C6110ky;
import com.daaw.KD0;
import com.daaw.Y41;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final int B;
    public final LayoutInflater C;
    public final CheckedTextView D;
    public final CheckedTextView E;
    public final a F;
    public boolean G;
    public Y41 H;
    public CheckedTextView[][] I;
    public DefaultTrackSelector J;
    public int K;
    public TrackGroupArray L;
    public boolean M;
    public DefaultTrackSelector.SelectionOverride N;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.d(view);
        }

        public /* synthetic */ a(TrackSelectionView trackSelectionView, AbstractDialogInterfaceOnClickListenerC3616c51 abstractDialogInterfaceOnClickListenerC3616c51) {
            this();
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int[] b(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i;
        return iArrCopyOf;
    }

    public static int[] c(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                iArr2[i2] = i3;
                i2++;
            }
        }
        return iArr2;
    }

    public final void d(View view) {
        if (view == this.D) {
            f();
        } else if (view == this.E) {
            e();
        } else {
            g(view);
        }
        h();
    }

    public final void e() {
        this.M = false;
        this.N = null;
    }

    public final void f() {
        this.M = true;
        this.N = null;
    }

    public final void g(View view) {
        this.M = false;
        Pair pair = (Pair) view.getTag();
        int iIntValue = ((Integer) pair.first).intValue();
        int iIntValue2 = ((Integer) pair.second).intValue();
        DefaultTrackSelector.SelectionOverride selectionOverride = this.N;
        if (selectionOverride == null || selectionOverride.B != iIntValue || !this.G) {
            this.N = new DefaultTrackSelector.SelectionOverride(iIntValue, iIntValue2);
            return;
        }
        int i = selectionOverride.D;
        int[] iArr = selectionOverride.C;
        if (!((CheckedTextView) view).isChecked()) {
            this.N = new DefaultTrackSelector.SelectionOverride(iIntValue, b(iArr, iIntValue2));
        } else if (i != 1) {
            this.N = new DefaultTrackSelector.SelectionOverride(iIntValue, c(iArr, iIntValue2));
        } else {
            this.N = null;
            this.M = true;
        }
    }

    public final void h() {
        this.D.setChecked(this.M);
        this.E.setChecked(!this.M && this.N == null);
        int i = 0;
        while (i < this.I.length) {
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.I[i];
                if (i2 < checkedTextViewArr.length) {
                    CheckedTextView checkedTextView = checkedTextViewArr[i2];
                    DefaultTrackSelector.SelectionOverride selectionOverride = this.N;
                    checkedTextView.setChecked(selectionOverride != null && selectionOverride.B == i && selectionOverride.a(i2));
                    i2++;
                }
            }
            i++;
        }
    }

    public final void i() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        DefaultTrackSelector defaultTrackSelector = this.J;
        b.a aVarE = defaultTrackSelector == null ? null : defaultTrackSelector.e();
        if (this.J == null || aVarE == null) {
            this.D.setEnabled(false);
            this.E.setEnabled(false);
            return;
        }
        this.D.setEnabled(true);
        this.E.setEnabled(true);
        this.L = aVarE.e(this.K);
        DefaultTrackSelector.Parameters parametersT = this.J.t();
        this.M = parametersT.d(this.K);
        this.N = parametersT.e(this.K, this.L);
        this.I = new CheckedTextView[this.L.B][];
        int i = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.L;
            if (i >= trackGroupArray.B) {
                h();
                return;
            }
            TrackGroup trackGroupA = trackGroupArray.a(i);
            boolean z = this.G && this.L.a(i).B > 1 && aVarE.a(this.K, i, false) != 0;
            this.I[i] = new CheckedTextView[trackGroupA.B];
            for (int i2 = 0; i2 < trackGroupA.B; i2++) {
                if (i2 == 0) {
                    addView(this.C.inflate(AD0.a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.C.inflate(z ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.B);
                checkedTextView.setText(this.H.a(trackGroupA.a(i2)));
                if (aVarE.f(this.K, i, i2) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i), Integer.valueOf(i2)));
                    checkedTextView.setOnClickListener(this.F);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.I[i][i2] = checkedTextView;
                addView(checkedTextView);
            }
            i++;
        }
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.G != z) {
            this.G = z;
            i();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.D.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(Y41 y41) {
        this.H = (Y41) AbstractC7115ob.e(y41);
        i();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.B = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.C = layoutInflaterFrom;
        a aVar = new a(this, null);
        this.F = aVar;
        this.H = new C6110ky(getResources());
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.D = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(KD0.f);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(AD0.a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.E = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(KD0.e);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }
}
