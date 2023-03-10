package com.example.samplearch.main.presentation

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.samplearch.R
import com.example.samplearch.main.domain.model.Post
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionFragmentHomeToFragmentDetails(
    public val postItem: Post
  ) : NavDirections {
    public override val actionId: Int = R.id.action_fragmentHome_to_fragmentDetails

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionFragmentHomeToFragmentDetails(postItem: Post): NavDirections =
        ActionFragmentHomeToFragmentDetails(postItem)
  }
}
