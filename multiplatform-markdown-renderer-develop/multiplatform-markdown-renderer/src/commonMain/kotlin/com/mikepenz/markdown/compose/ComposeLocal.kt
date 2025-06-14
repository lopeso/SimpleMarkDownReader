package com.mikepenz.markdown.compose

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import com.mikepenz.markdown.compose.components.MarkdownComponents
import com.mikepenz.markdown.compose.components.markdownComponents
import com.mikepenz.markdown.model.BulletHandler
import com.mikepenz.markdown.model.DefaultMarkdownAnnotator
import com.mikepenz.markdown.model.DefaultMarkdownAnnotatorConfig
import com.mikepenz.markdown.model.DefaultMarkdownExtendedSpans
import com.mikepenz.markdown.model.DefaultMarkdownInlineContent
import com.mikepenz.markdown.model.ImageTransformer
import com.mikepenz.markdown.model.MarkdownAnimations
import com.mikepenz.markdown.model.MarkdownAnnotator
import com.mikepenz.markdown.model.MarkdownColors
import com.mikepenz.markdown.model.MarkdownDimens
import com.mikepenz.markdown.model.MarkdownExtendedSpans
import com.mikepenz.markdown.model.MarkdownInlineContent
import com.mikepenz.markdown.model.MarkdownPadding
import com.mikepenz.markdown.model.MarkdownTypography
import com.mikepenz.markdown.model.ReferenceLinkHandler

/**
 * The CompositionLocal to provide functionality related to transforming the bullet of an ordered list
 */
val LocalBulletListHandler = staticCompositionLocalOf {
    return@staticCompositionLocalOf BulletHandler { _, _, _, _, _ -> "• " }
}

/**
 * The CompositionLocal to provide functionality related to transforming the bullet of an ordered list
 */
val LocalOrderedListHandler = staticCompositionLocalOf {
    return@staticCompositionLocalOf BulletHandler { _, _, index, listNumber, _ -> "${listNumber + index}. " }
}

/**
 * Local [ReferenceLinkHandler] provider
 */
val LocalReferenceLinkHandler = staticCompositionLocalOf<ReferenceLinkHandler> {
    error("CompositionLocal ReferenceLinkHandler not present")
}

/**
 * Local [MarkdownColors] provider
 */
val LocalMarkdownColors = compositionLocalOf<MarkdownColors> {
    error("No local MarkdownColors")
}

/**
 * Local [MarkdownTypography] provider
 */
val LocalMarkdownTypography = compositionLocalOf<MarkdownTypography> {
    error("No local MarkdownTypography")
}

/**
 * Local [MarkdownPadding] provider
 */
val LocalMarkdownPadding = staticCompositionLocalOf<MarkdownPadding> {
    error("No local Padding")
}

/**
 * Local [MarkdownDimens] provider
 */
val LocalMarkdownDimens = compositionLocalOf<MarkdownDimens> {
    error("No local MarkdownDimens")
}

/**
 * Local [ImageTransformer] provider
 */
val LocalImageTransformer = staticCompositionLocalOf<ImageTransformer> {
    error("No local ImageTransformer")
}

/**
 * Local [MarkdownInlineContent] provider
 */
val LocalMarkdownInlineContent = staticCompositionLocalOf<MarkdownInlineContent> {
    return@staticCompositionLocalOf DefaultMarkdownInlineContent(mapOf())
}

/**
 * Local [MarkdownAnnotator] provider
 */
val LocalMarkdownAnnotator = compositionLocalOf<MarkdownAnnotator> {
    return@compositionLocalOf DefaultMarkdownAnnotator(null, DefaultMarkdownAnnotatorConfig())
}

/**
 * Local [MarkdownExtendedSpans] provider
 */
val LocalMarkdownExtendedSpans = compositionLocalOf<MarkdownExtendedSpans> {
    return@compositionLocalOf DefaultMarkdownExtendedSpans(null)
}

/**
 * Local [MarkdownComponents] provider
 */
val LocalMarkdownComponents = compositionLocalOf<MarkdownComponents> {
    return@compositionLocalOf markdownComponents()
}

/**
 * Local [MarkdownAnimations] provider
 */
val LocalMarkdownAnimations = compositionLocalOf<MarkdownAnimations> {
    error("No local MarkdownAnimations")
}