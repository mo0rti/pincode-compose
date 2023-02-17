package bluevelvet.composents.foundation.menu

/**
 * Composents Menu item type
 *
 * @author Morteza Taghdisi
 * @since 2023-02-16
 **/

enum class ComposentsMenuItemType {
    /**
     * For an Appbar to be always visible, for a drawer to show as a clickable item
     * */
    PRIMARY,

    /**
     * For an Appbar to show as an overflow menu item, for a drawer to be shown as a header and non-clickable item
     * */
    SECONDARY
}
