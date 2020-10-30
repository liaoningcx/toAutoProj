/**
 * 数字公共工具.
 * User: dbcxue
 * Date: 12-11-13
 * Time: 下午3:44
 */
DataUtil = (function() {
    return {
        /**
         * 获取随机数
         * @param number 随机数最大值，
         * @return {Number}
         */
        random: function (number) {
            if (number === undefined || number === null) {
                number = 10000;
            }
            return parseInt(number * Math.random());
        },
    }
})();

