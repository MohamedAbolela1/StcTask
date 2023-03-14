package com.example.samplearch.productDetails.presentation

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.samplearch.home.domain.model.Post
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val postItem: Post
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Post::class.java)) {
      result.putParcelable("postItem", this.postItem as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Post::class.java)) {
      result.putSerializable("postItem", this.postItem as Serializable)
    } else {
      throw UnsupportedOperationException(Post::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Post::class.java)) {
      result.set("postItem", this.postItem as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Post::class.java)) {
      result.set("postItem", this.postItem as Serializable)
    } else {
      throw UnsupportedOperationException(Post::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __postItem : Post?
      if (bundle.containsKey("postItem")) {
        if (Parcelable::class.java.isAssignableFrom(Post::class.java) ||
            Serializable::class.java.isAssignableFrom(Post::class.java)) {
          __postItem = bundle.get("postItem") as Post?
        } else {
          throw UnsupportedOperationException(Post::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__postItem == null) {
          throw IllegalArgumentException("Argument \"postItem\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"postItem\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__postItem)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __postItem : Post?
      if (savedStateHandle.contains("postItem")) {
        if (Parcelable::class.java.isAssignableFrom(Post::class.java) ||
            Serializable::class.java.isAssignableFrom(Post::class.java)) {
          __postItem = savedStateHandle.get<Post?>("postItem")
        } else {
          throw UnsupportedOperationException(Post::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__postItem == null) {
          throw IllegalArgumentException("Argument \"postItem\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"postItem\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__postItem)
    }
  }
}
