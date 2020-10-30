/**
 * 字串公共工具.
 * User: dbcxue
 * Date: 12-11-13
 * Time: 下午3:44
 */
StringUtil = (function() {
    return {
        /**
         * 是否为空
         * @param str 校验字串，
         * @return {Number}
         */
        isEmpty: function (str) {
            return str == null || str == undefined || str.length == 0;
        },
    }
})();

