// Generated by view binder compiler. Do not edit!
package com.example.samplearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.samplearch.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class LayoutProgressMainBinding implements ViewBinding {
  @NonNull
  private final ProgressBar rootView;

  @NonNull
  public final ProgressBar progress;

  private LayoutProgressMainBinding(@NonNull ProgressBar rootView, @NonNull ProgressBar progress) {
    this.rootView = rootView;
    this.progress = progress;
  }

  @Override
  @NonNull
  public ProgressBar getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutProgressMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutProgressMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_progress_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutProgressMainBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ProgressBar progress = (ProgressBar) rootView;

    return new LayoutProgressMainBinding((ProgressBar) rootView, progress);
  }
}